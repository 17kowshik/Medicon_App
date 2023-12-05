package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PatientDetailsActivity extends AppCompatActivity {
    Button b;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);
        b = findViewById(R.id.button6);
        e = findViewById(R.id.editTextTextPersonName6);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(PatientDetailsActivity.this);
                builder.setTitle("SUCCESS");
                builder.setMessage("Details Successfully Submitted for Patient -"+name);
                builder.setPositiveButton("OK", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent i = new Intent(PatientDetailsActivity.this,DoctorDetails.class);
                                startActivity(i);
                            }
                        });
        builder.create();
        builder.show();}
        });
    }
}