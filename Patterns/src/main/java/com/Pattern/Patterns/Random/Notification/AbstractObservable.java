package com.Pattern.Patterns.Random.Notification;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractObservable {
    List<NotificationObserver> observers = new ArrayList<>();

    Notification notification;
    AbstractObservable() {
    }
    public AbstractObservable(Notification notification) {
        this.notification = notification;
    }

    abstract void notifyObservers();
}
