package com.Pattern.Patterns.Random.Notification;

public class NotificationDecorator extends Notification {
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String getNofification() {
        return notification.getNofification();
    }
}
