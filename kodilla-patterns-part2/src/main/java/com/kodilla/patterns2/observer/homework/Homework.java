package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable{

    private final String homeworkName;
    private List<HomeworkObserver> observers;


    public Homework(String homeworkName) {
        this.observers = new ArrayList<>();
        this.homeworkName = homeworkName;
    }

    public String getHomeworkName() {
        return homeworkName;
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver ){
       observers.add(homeworkObserver);
    }

    @Override
    public void notifyObserver() {
        for (HomeworkObserver homeworkObserver : observers) {
        homeworkObserver.update(this);
        }
    }

    @Override
    public void removeObserver (HomeworkObserver homeworkObserver) {
        observers.remove(homeworkObserver);
    }
}
