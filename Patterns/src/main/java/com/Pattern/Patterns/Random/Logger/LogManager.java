package com.Pattern.Patterns.Random.Logger;

import java.util.ArrayList;

public class LogManager {
    private static ArrayList<LogStrategy> logStrategy;
    private static StrategyFactory strategyFactory = new StrategyFactory();

    private LogManager() {
       logStrategy = new ArrayList<>();
    }

    public static LogManager getInstance() {
        return new LogManager();
    }

    public static void  addLogStrategy(LogTo type) {
        LogStrategy strategy = strategyFactory.createLogStrategy(type);
        logStrategy.add(strategy);
    }
    public static void log(String message, LogLevel level) {
        for (LogStrategy logStrategy : logStrategy){
            logStrategy.log(message, level);
        }
    }
}
