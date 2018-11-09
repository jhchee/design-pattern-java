package com.vincent.observer_pattern;


// observer pattern uses three actor classes
// namely, subject, observer, client
// this is Subject class

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        // since changes occur
        // must notify all observer
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        // attaching in this context basically add
        // add observer instance to subject
        observers.add(observer);
    }

    public void notifyAllObservers() {
        // list of observers since there's octal, hexa and binary observer
        // call all for notifying update
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
