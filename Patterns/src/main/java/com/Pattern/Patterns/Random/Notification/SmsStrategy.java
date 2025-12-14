package com.Pattern.Patterns.Random.Notification;

public class SmsStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
