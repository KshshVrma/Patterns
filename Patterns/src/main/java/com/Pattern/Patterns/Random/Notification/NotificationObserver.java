package com.Pattern.Patterns.Random.Notification;

abstract public class NotificationObserver {
    NotificationObservable observable;

    public void setObservable(NotificationObservable observable) {
        this.observable = observable;
    }

    abstract void update(String message);
}
