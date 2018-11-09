package com.vincent.observer_pattern;

// observer pattern uses three actor classes
// namely, subject, observer, client
// this is Client class

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // instantiate subject
        Subject subject = new Subject();

        // instantiate observer
        // and attach each observer to subject
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // experimenting with state changing
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
