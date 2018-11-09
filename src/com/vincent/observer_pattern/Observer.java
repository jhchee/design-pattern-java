package com.vincent.observer_pattern;

// observer pattern uses three actor classes
// namely, subject, observer, client
// this is Observer class

// class is declared as abstract to allow implementation of its own
// observer implementation will be provided by the subclass(es)
public abstract class Observer {
    // only can be changed by the subclasses themselves
    protected Subject subject;

    public abstract void update();
}
