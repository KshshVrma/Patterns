package com.Pattern.Patterns.Random.Logger;

public class RemoteLogStrategy implements LogStrategy {
    public void log(String message, LogLevel level) {
        // Simulate sending log to a remote server
        System.out.println("Remote Log [" + level + "]: " + message);
    }
}
