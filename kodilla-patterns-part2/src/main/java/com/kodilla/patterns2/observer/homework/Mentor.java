package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements HomeworkObserver {
    private final String mentorName;
    private int updateCount;
    private String studentName;


    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String studentWithNewHomework(KodillaStudent kodillaStudent) {
        return studentName=kodillaStudent.getStudentName();
    }

    @Override
    public void update(Homework homework){
        System.out.println(mentorName+": New homework to check: " + homework.getHomeworkName() + ", of student: "+ studentName);
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
