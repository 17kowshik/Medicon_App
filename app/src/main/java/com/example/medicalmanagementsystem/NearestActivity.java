package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NearestActivity extends AppCompatActivity {
    String[] names = {"Vijayawada","Rajamundry","Hyderabad","Kurnool"};
    String[] links = {"https://goo.gl/maps/J8JoMLsRySVmS72V9","https://goo.gl/maps/xPht5wAZULnpqbdR8","https://goo.gl/maps/8ztZGPssjT4SNpbm8","https://goo.gl/maps/qvDbk4QgUmLGMWt29"};
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest);
        l = findViewById(R.id.lvvvvvv);
        ArrayAdapter a = new ArrayAdapter<>(this, androidx.appcompat.R.layout.select_dialog_item_material,names);
        l.setAdapter(a);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Uri uri = Uri.parse(links[i]);
                Intent in =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(in);
            }
        });
    }
}