package com.example.rowdyhacks;

import java.io.Serializable;
import java.util.HashMap;

class CourseClass implements Serializable {
    private static String [] courseID = {"", "", "", "", "", ""};
    private static String [] courseName = {"", "", "", "", "", ""};
    private static String [] courseDays = new String [6];
    private static String [] courseTime = new String [6];
    private static String [] finalExamDate = new String [6];
    private static String [] finalExamTime = new String [6];

    private HashMap <String, String> nameMap = new HashMap<>();

    CourseClass() {
        nameMap.put("Math 101", "Pre-Calculus");
    }


    void setCourseID(String SCID, int num) {
        courseID[num] = SCID;
    }
    void setCourseName(String CN, int num) {
        courseName[num] = CN;
    }
    void setCourseDays(String CD, int num) {
        courseDays[num] = CD;
    }
    void setCourseTime(String CT, int num) {
        courseTime[num] = CT;
    }
    void setFinalExamDate(String FED, int num) {
        finalExamDate[num] = FED;
    }
    void setFinalExamTime(String FET, int num) {
        finalExamTime[num] = FET;
    }

    String getCourseID(int num) {
        return courseID[num];
    }
    String getCourseName(int num) {
        if (courseID[num].equals("Math 101")) {
            return "Pre-Calculus";
        }
        return courseName[num];
    }
    String getCourseDays(int num) {
        return courseDays[num];
    }
    String getCourseTime(int num) {
        return courseTime[num];
    }
    String getFinalExamTime(int num) {
        return finalExamTime[num];
    }
    String getFinalExamDate(int num) {
        return finalExamDate[num];
    }

    void clear(int num) {
        courseID[num] = " ";
        courseName[num] = " ";
        courseDays[num] = " ";
        courseTime[num] = " ";
        finalExamDate[num] = " ";
        finalExamTime[num] = " ";
    }

    String description (int num) {
        return (courseName[num] + " " + courseDays[num] + " " + courseTime[num]);
    }

    String description2 (int num) {
        if (finalExamDate[num] == null && finalExamTime[num] == null) {
        return " ";
        }
        return(finalExamDate[num] + " " + finalExamTime[num]);
    }
}