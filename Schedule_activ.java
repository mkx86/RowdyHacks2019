package com.example.rowdyhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Schedule_activ extends AppCompatActivity {

    CourseClass Courses;

    TextView courseT2;
    TextView courseT3;
    TextView courseT4;
    TextView courseT5;
    TextView courseT6;
    TextView courseT7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_activ);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Courses = (CourseClass) getIntent().getSerializableExtra("Courses");

        TextView dateView = findViewById(R.id.Date);
        setDate(dateView);

        courseT2 = findViewById(R.id.schedule_text2);
        getData(courseT2, 0);

        courseT3 = findViewById(R.id.schedule_text3);
        getData(courseT3,1);

        courseT4 = findViewById(R.id.schedule_text4);
        getData(courseT4, 2);

        courseT5 = findViewById(R.id.schedule_text5);
        getData(courseT5, 3);

        courseT6 = findViewById(R.id.schedule_text6);
        getData(courseT6, 4);

        courseT7 = findViewById(R.id.schedule_text7);
        getData(courseT7, 5);
    }

    public void setDate(TextView view){
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        String date = formatter.format(today);
        view.setText(date);
    }

    public void getData(TextView v, int num){
        v.setText(Courses.description2(num));

    }
}
