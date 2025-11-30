package com.Pattern.Patterns.Random.Logger;

public class Client {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getInstance();

        LogManager.addLogStrategy(LogTo.CONSOLE);
        LogManager.addLogStrategy(LogTo.FILE);
        LogManager.addLogStrategy(  LogTo.REMOTE);

        LogManager.log("This is an info message.", LogLevel.INFO);
        LogManager.log("This is a debug message.", LogLevel.DEBUG);
        LogManager.log("This is an error message.", LogLevel.ERROR);

        LogManager.log("This is an another", LogLevel.INFO);
    }
}
