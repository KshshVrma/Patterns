package com.Pattern.Patterns.Random.Notification;

public class Lognotification extends NotificationObserver {

    @Override
    public void update(String message) {
        System.out.println("Log Notification: " + message);
    }
}
