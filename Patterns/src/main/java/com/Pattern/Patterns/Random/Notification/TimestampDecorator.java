package com.Pattern.Patterns.Random.Notification;

public class TimestampDecorator extends NotificationDecorator {
    public TimestampDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getNofification() {
        return super.getNofification() + " [Timestamp: " + System.currentTimeMillis() + "]";
    }
}
