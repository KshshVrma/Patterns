package com.Pattern.Patterns.Random.Logger;

import java.util.ArrayList;

public class LogManager {
    private ArrayList<LogStrategy> logStrategy;
    private StrategyFactory strategyFactory = new StrategyFactory();

    public LogManager() {
        this.logStrategy = new ArrayList<>();
    }

void addLogStrategy(LogTo type) {
        LogStrategy strategy = strategyFactory.createLogStrategy(type);
        this.logStrategy.add(strategy);
    }
    public void log(String message, LogLevel level) {
        for (LogStrategy logStrategy : this.logStrategy){
            logStrategy.log(message, level);
        }
    }
}
