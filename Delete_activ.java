package com.example.rowdyhacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static android.graphics.Color.GRAY;

public class Delete_activ extends AppCompatActivity {

    Button DeleteButton;

    CheckBox CheckBox1;
    CheckBox CheckBox2;
    CheckBox CheckBox3;
    CheckBox CheckBox4;
    CheckBox CheckBox5;
    CheckBox CheckBox6;

    TextView DeleteCourseText1;
    TextView DeleteCourseText2;
    TextView DeleteCourseText3;
    TextView DeleteCourseText4;
    TextView DeleteCourseText5;
    TextView DeleteCourseText6;

    CourseClass Courses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_activ);


        Courses = (CourseClass) getIntent().getSerializableExtra("Courses");

        DeleteButton = findViewById(R.id.deleteButton);
        CheckBox1 = findViewById(R.id.checkBox1);
        CheckBox2 = findViewById(R.id.checkBox2);
        CheckBox3 = findViewById(R.id.checkBox3);
        CheckBox4 = findViewById(R.id.checkBox4);
        CheckBox5 = findViewById(R.id.checkBox5);
        CheckBox6 = findViewById(R.id.checkBox6);
        DeleteCourseText1 = findViewById(R.id.deleteCourseText1);
        DeleteCourseText2 = findViewById(R.id.deleteCourseText2);
        DeleteCourseText3 = findViewById(R.id.deleteCourseText3);
        DeleteCourseText4 = findViewById(R.id.deleteCourseText4);
        DeleteCourseText5 = findViewById(R.id.deleteCourseText5);
        DeleteCourseText6 = findViewById(R.id.deleteCourseText6);

        if (Courses.getCourseID(0).equals("")) {
            CheckBox1.setEnabled(false);
            CheckBox1.setTextColor(GRAY);
        } else {
            DeleteCourseText1.setText(Courses.description(0));
        }


        if (Courses.getCourseID(1).equals("")) {
            CheckBox2.setEnabled(false);
            CheckBox2.setTextColor(GRAY);
        }

        else {
            DeleteCourseText2.setText(Courses.description(1));
        }

        if (Courses.getCourseID(2).equals("")) {
            CheckBox3.setEnabled(false);
            CheckBox3.setTextColor(GRAY);
        }

        else {
            DeleteCourseText3.setText(Courses.description(2));
        }

        if (Courses.getCourseID(3).equals("")) {
            CheckBox4.setEnabled(false);
            CheckBox4.setTextColor(GRAY);
        }

        else {
            DeleteCourseText4.setText(Courses.description(3));
        }

        if (Courses.getCourseID(4).equals("")) {
            CheckBox5.setEnabled(false);
            CheckBox5.setTextColor(GRAY);
        }

        else {
            DeleteCourseText5.setText(Courses.description(4));
        }

        if (Courses.getCourseID(5).equals("")) {
            CheckBox6.setEnabled(false);
            CheckBox6.setTextColor(GRAY);
        }

        else {
            DeleteCourseText6.setText(Courses.description(5));
        }

    }

    public void onClick(View deleteTheseCourses) {
        if (CheckBox1.isChecked()) {
            Courses.clear(0);
            CheckBox1.setTextColor(GRAY);
            DeleteCourseText1.setText("");
            CheckBox1.setChecked(false);
            CheckBox1.setEnabled(false);
        }

        if (CheckBox2.isChecked()) {
            Courses.clear(1);
            CheckBox2.setTextColor(GRAY);
            DeleteCourseText2.setText("");
            CheckBox2.setChecked(false);
            CheckBox2.setEnabled(false);
        }

        if (CheckBox3.isChecked()) {
            Courses.clear(2);
            CheckBox3.setTextColor(GRAY);
            DeleteCourseText3.setText("");
            CheckBox3.setChecked(false);
            CheckBox3.setEnabled(false);
        }

        if (CheckBox4.isChecked()) {
            Courses.clear(3);
            CheckBox4.setTextColor(GRAY);
            DeleteCourseText4.setText("");
            CheckBox4.setChecked(false);
            CheckBox4.setEnabled(false);
        }

        if (CheckBox5.isChecked()) {
            Courses.clear(4);
            CheckBox5.setTextColor(GRAY);
            DeleteCourseText5.setText("");
            CheckBox5.setChecked(false);
            CheckBox5.setEnabled(false);
        }

        if (CheckBox6.isChecked()) {
            Courses.clear(5);
            CheckBox6.setTextColor(GRAY);
            DeleteCourseText6.setText("");
            CheckBox6.setChecked(false);
            CheckBox6.setEnabled(false);
        }
    }

}