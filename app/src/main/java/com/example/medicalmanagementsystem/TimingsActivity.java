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

public class TimingsActivity extends AppCompatActivity {
    ListView lv;
    String names[] = {"Dr. Siddhartha. P","Dr. Kowshik. V", "Dr. Rajesh. K","Dr. Charmi Priya. B", "Dr. Karthika. T","Dr. Karthik. Y","Dr. Sudhakar. M", "Dr. Samuel. K","Dr. Sushma. R"};
    String timings[] = {"9 AM-11 AM , 2 PM-3 PM","10 AM-12 AM , 3 PM-6 PM","9 AM-10 AM , 2 PM-5 PM","4 PM-6 PM , 9 PM-12 AM","3 PM-5 PM , 8 PM-11 AM","4 AM-9 AM , 10 AM-12 PM","12 AM-3 AM , 1 PM-4 PM","4 PM-6 PM , 9 PM-12 AM","12 PM-1 PM , 3 PM-5 AM"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timings);
        lv = findViewById(R.id.lvvv);
        CustomAdapter c = new CustomAdapter(this);
        lv.setAdapter(c);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(TimingsActivity.this,HomeActivity.class);
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
            t2.setText(timings[i]);
            return view1;
        }
    }
}