package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MembershipActivity extends AppCompatActivity {
    RadioGroup rg;
    Button submit;
    String text;
    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);
        rg = findViewById(R.id.radioGroup);
        submit = findViewById(R.id.button25);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rb = findViewById(rg.getCheckedRadioButtonId());
                String text = rb.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(MembershipActivity.this);
                builder.setTitle("Congratulations !!!");
                builder.setMessage("You are now a Medicon member with the Plan -"+text);
                builder.setPositiveButton("OK", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent i = new Intent(MembershipActivity.this,HomeActivity.class);
                                startActivity(i);
                            }
                        });
                builder.create();
                builder.show();
            }
        });
    }
}