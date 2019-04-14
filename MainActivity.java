package com.example.rowdyhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button AddClass;
    private Button Delete;
    private Button Schedule;

    CourseClass Courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Courses = new CourseClass();

        AddClass = findViewById(R.id.Main_button_1);
        AddClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToAdd();
            }
        });

        Delete = findViewById(R.id.Main_button_2);
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToDelete();
            }
        });

        Schedule = findViewById(R.id.Main_button_3);
        Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSchedule();
            }
        });
    }

    private void moveToAdd(){
        Intent intent = new Intent(MainActivity.this, Add_schedule_activ.class);
        intent.putExtra("Courses", Courses);
        startActivity(intent);
    }

    private void moveToDelete(){
        Intent intent_2 = new Intent(MainActivity.this, Delete_activ.class);
        intent_2.putExtra("Courses", Courses);
        startActivity(intent_2);
    }

    private void moveToSchedule(){
        Intent intent_3 = new Intent(MainActivity.this, Schedule_activ.class);
        intent_3.putExtra("Courses", Courses);
        startActivity(intent_3);
    }

}
