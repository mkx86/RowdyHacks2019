package com.example.rowdyhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.support.v4.app.NotificationCompat;
import android.app.NotificationManager;



public class Add_schedule_activ extends AppCompatActivity {

    CourseClass Courses;
    Spinner Spinner1;
    Spinner Spinner2;
    Spinner Spinner3;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_schedule_activ);
        Courses = (CourseClass) getIntent().getSerializableExtra("Courses");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Spinner1 = findViewById(R.id.Spinner1);
        Spinner2 = findViewById(R.id.Spinner2);
        Spinner3 = findViewById(R.id.Spinner3);

        button1 = findViewById(R.id.buttonAdd);

    }


    public void notification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.notification);
        builder.setContentTitle("Final Exam Scheduler");
        builder.setContentText("A class has been added to your Schedule!");
        NotificationManager notificationManager = (NotificationManager) getSystemService(
                NOTIFICATION_SERVICE);
        notificationManager.notify(23, builder.build());
    }

    public void onClick(View addCourse) {
        notification();
        int i;
        for (i = 0; i < 6; ++i) {
            if(Courses.getCourseID(i)==(null)){
                Courses.setFinalExamTime("", i);

                break;
            }
            if (Courses.getCourseID(i).equals("")) {
                Courses.setCourseID(Spinner1.getSelectedItem().toString(), i);
                Courses.setCourseDays(Spinner2.getSelectedItem().toString(), i);
                Courses.setCourseTime(Spinner3.getSelectedItem().toString(), i);
                Courses.setFinalExamTime(i + ":30", i);
                Courses.setFinalExamDate("Monday", i);
                break;
            }
            }

    }

}

