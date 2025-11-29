package com.Pattern.Patterns.Random.Logger;

public class FileWriteStrategy implements LogStrategy {
    @Override
    public void log(String message, LogLevel level) {
        // Simulate writing to a file
        System.out.println("Writing to file: [" + level + "] " + message);
    }
}
