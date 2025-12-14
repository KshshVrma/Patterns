package com.Pattern.Patterns.Random.Notification;

public class BasicNotication extends Notification {
    public BasicNotication(String message) {
        this.message = message;
    }
    public String getNofification() {
        return this.message;
    }

}
