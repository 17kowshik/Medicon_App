package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    TextView t;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.button);
        t = findViewById(R.id.textView);
        e1 =findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un = e1.getText().toString();
                String pw = e2.getText().toString();

                if (un.equals("21BCE7160") && pw.equals("priyanka")){
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}