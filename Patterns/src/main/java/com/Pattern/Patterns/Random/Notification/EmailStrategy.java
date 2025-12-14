package com.Pattern.Patterns.Random.Notification;

public class EmailStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email notification with message: " + message);
    }
}
