package com.Pattern.Patterns.Random.Logger;

public class ConsoleLogStrategy implements LogStrategy {
    @Override
    public void log(String message, LogLevel level) {
        System.out.println("[" + level + "] " + message);
    }
}
