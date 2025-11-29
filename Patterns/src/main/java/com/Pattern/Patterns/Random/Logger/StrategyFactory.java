package com.Pattern.Patterns.Random.Logger;

public class StrategyFactory {
    public LogStrategy createLogStrategy(LogTo type) {
        switch (type) {
            case CONSOLE:
                return new ConsoleLogStrategy();
            case FILE:
                return new FileWriteStrategy();
            case REMOTE:
                return new RemoteLogStrategy();
            default:
                throw new IllegalArgumentException("Unknown LogType: " + type);
        }
    }
}
