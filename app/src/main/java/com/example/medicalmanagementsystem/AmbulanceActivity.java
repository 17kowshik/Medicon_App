package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AmbulanceActivity extends AppCompatActivity {
    Button b108;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
        b108 = findViewById(R.id.button23);

        b108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel: 108");
                Intent i = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(i);
            }
        });
    }
}