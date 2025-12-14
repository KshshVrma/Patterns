package com.Pattern.Patterns.Random.Notification;

public class NotificationService {
    Notification notification;
    NotificationObservable observable;
    public NotificationService() {
        this.observable = new NotificationObservable();
        this.observable.addObserver(new NotificationEngine());
        this.observable.addObserver(new Lognotification());
    }
    void AddLoggerObserver( ) {
        this.observable.addObserver(new Lognotification());
    }
    void AddEngineObserver( ) {
        this.observable.addObserver(new NotificationEngine());}

    void addNotification(String notif) {
        this.notification = new TimestampDecorator(new BasicNotication(notif));
        this.observable.setNotification(notification);
    }
}
