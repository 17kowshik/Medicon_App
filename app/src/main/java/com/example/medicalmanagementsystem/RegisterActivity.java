package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        b = findViewById(R.id.button2);
        e1 = findViewById(R.id.editTextTextPersonName2);
        e2 = findViewById(R.id.editTextTextPersonName3);
        e3 = findViewById(R.id.editTextTextPersonName4);
        e4 = findViewById(R.id.editTextTextEmailAddress);
        e5 = findViewById(R.id.editTextPhone);
        e6 = findViewById(R.id.editTextTextPersonName5);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(e1.equals("")) && !(e2.equals("")) && !(e3.equals("")) && !(e4.equals("")) && !(e5.equals("")) && !(e6.equals(""))) {
                    Intent i = new Intent(RegisterActivity.this, HomeActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Fill all Details !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}