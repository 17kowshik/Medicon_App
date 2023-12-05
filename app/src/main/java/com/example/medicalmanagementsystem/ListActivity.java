package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    String[] list = {"Full Body Check-up","Diabetes","Women's Health","Hairfall","Liver","Thyroid","Kidney","Heart",
            "Hormones","Blood Test"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView lv = findViewById(R.id.lvv);
        ArrayAdapter a = new ArrayAdapter<>(this, androidx.appcompat.R.layout.select_dialog_item_material,list);
        lv.setAdapter(a);

    }
}