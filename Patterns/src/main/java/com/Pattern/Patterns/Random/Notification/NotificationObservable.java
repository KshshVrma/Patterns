package com.Pattern.Patterns.Random.Notification;

public class NotificationObservable extends AbstractObservable{

    public NotificationObservable(Notification notification) {
        super(notification);
    }
    public NotificationObservable() {
        super();
    }
    void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }
    @Override
    void notifyObservers() {
        for (NotificationObserver observer : observers) {
            observer.update(notification.getNofification());
        }
    }
    void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
        notifyObservers();
    }
    public String getNotification(){
        return this.notification.getNofification();
    }
}
