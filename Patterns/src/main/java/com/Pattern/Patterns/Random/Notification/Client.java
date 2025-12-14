package com.Pattern.Patterns.Random.Notification;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter notification message:");
      String notification = scanner.nextLine();
       NotificationService notificationService = new NotificationService();
       notificationService.addNotification(notification);

    }
}
