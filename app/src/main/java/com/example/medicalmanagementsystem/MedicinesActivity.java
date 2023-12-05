package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MedicinesActivity extends AppCompatActivity {
    String[] meds = {"Cefix 200 - Price : 100","Dolo 650 - Price : 50","Ofloxacin - Price : 400","Moov spray - Price : 800","Volini Day - Price : 900","Pregnancy Care Kit - Price : 500","Saridon - Price : 300"};
    ListView lv;
    Button border;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines);
        lv = findViewById(R.id.lvvvvv);
        border = findViewById(R.id.button24);
        ArrayAdapter a = new ArrayAdapter<>(this, androidx.appcompat.R.layout.select_dialog_item_material,meds);
        lv.setAdapter(a);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                name = meds[i];
            }
        });
        border.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MedicinesActivity.this);
                builder.setTitle("ORDER PLACED");
                builder.setMessage("Order Placed Successfully for medicine - "+name);
                builder.setPositiveButton("OK", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(MedicinesActivity.this,HomeActivity.class);
                                startActivity(i);
                            }
                        });
                builder.create();
                builder.show();
            }
        });
    }
}