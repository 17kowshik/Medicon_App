package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class AppointmentActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;
    TextView tv;
    String date;
    String time;

    int[] d = new int[3];
    int[] t = new int[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        b1 = findViewById(R.id.button12);
        b2 = findViewById(R.id.button17);
        b3 = findViewById(R.id.button18);
        b4 = findViewById(R.id.button19);
        b5 = findViewById(R.id.button20);
        tv = findViewById(R.id.textView7);
        Intent i = getIntent();
        String doc = i.getStringExtra("DOCTOR_NAME");
        tv.setText(doc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(AppointmentActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        final Calendar c1 = Calendar.getInstance();
                        d[0] = c1.get(Calendar.YEAR);
                        d[1] = c1.get(Calendar.MONTH);
                        d[2] = c1.get(Calendar.DAY_OF_MONTH);
                        b1.setText(String.valueOf(dayOfMonth + "/" +(month+1) + "/" + year));
                        d[0] = dayOfMonth;
                        d[1] = month;
                        d[2] = year;
                        date = b1.getText().toString();
                    }
                },d[0],d[1],d[2]);
                datePickerDialog.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(AppointmentActivity.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    final Calendar c2 = Calendar.getInstance();
                    t[0] = c2.get(Calendar.HOUR_OF_DAY);
                    t[1] = c2.get(Calendar.MINUTE);
                    b2.setText(String.valueOf(hourOfDay + ":" + minute));
                    t[0] = hourOfDay;
                    t[1] = minute;
                    time = b2.getText().toString();
                }
                },t[0],t[1],true);
                timePickerDialog.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel: +7396545602");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://goo.gl/maps/YNSgyKby797tv5cw9");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppointmentActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}