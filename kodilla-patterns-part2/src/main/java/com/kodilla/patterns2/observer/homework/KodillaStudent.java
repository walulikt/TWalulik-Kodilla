package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaStudent {
    private final String studentName;
    private List<Homework> listOfHomewoks;
    private Mentor mentor;

    public KodillaStudent(String studentName, Mentor mentor) {
        this.studentName = studentName;
        this.mentor =mentor;
        this.listOfHomewoks=new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addHomework(Homework homework){
        listOfHomewoks.add(homework);
        mentor.studentWithNewHomework(this);
        homework.notifyObserver();
    }
}
