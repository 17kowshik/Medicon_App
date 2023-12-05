package com.example.medicalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DoctorDetails extends AppCompatActivity {
    String names[] = {"Dr. Siddhartha. P","Dr. Kowshik. V", "Dr. Rajesh. K","Dr. Charmi Priya. B", "Dr. Karthika. T","Dr. Karthik. Y","Dr. Sudhakar. M", "Dr. Samuel. K","Dr. Sushma. R"};
    String occupations[] = {"Orthopedician","Dermatologist","Cardiologist","General Physician","Neurologist","ENT","Psychiartist","Gastroentrologist","Gynecologist"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
        lv = findViewById(R.id.lv);
        CustomAdapter c = new CustomAdapter(this);
        lv.setAdapter(c);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(DoctorDetails.this,AppointmentActivity.class);
                in.putExtra("DOCTOR_NAME",names[i]);
                startActivity(in);
            }
        });
    }
    private class CustomAdapter extends BaseAdapter {
        Context c;
        public CustomAdapter(Context c) {
            this.c = c;
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.doctordetailslayout,null);
            TextView t = view1.findViewById(R.id.textView6);
            TextView t2 = view1.findViewById(R.id.textView5);
            t.setText(names[i]);
            t2.setText(occupations[i]);
            return view1;
        }
    }
}