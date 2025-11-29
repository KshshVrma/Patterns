package com.Pattern.Patterns.Random.Logger;

public class Client {
    public static void main(String[] args) {
        LogManager logManager = new LogManager();

        logManager.addLogStrategy(LogTo.CONSOLE);
        logManager.addLogStrategy(LogTo.FILE);
        logManager.addLogStrategy(  LogTo.REMOTE);

        logManager.log("This is an info message.", LogLevel.INFO);
        logManager.log("This is a debug message.", LogLevel.DEBUG);
        logManager.log("This is an error message.", LogLevel.ERROR);

        logManager.log("This is an another", LogLevel.INFO);
    }
}
