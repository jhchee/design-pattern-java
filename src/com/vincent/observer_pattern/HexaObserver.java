package com.vincent.observer_pattern;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        // link to one subject
        this.subject = subject;
        // that particular subject is attached with this listener/observer
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
