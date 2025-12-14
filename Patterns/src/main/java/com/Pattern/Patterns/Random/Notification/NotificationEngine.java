package com.Pattern.Patterns.Random.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine extends NotificationObserver{
   List<NotificationStrategy> strategy=new ArrayList<>();

   public NotificationEngine(){
      strategy.add(new EmailStrategy());
        strategy.add(new SmsStrategy());
   }

    public void setStrategy(String strategy) {
        if(strategy.equalsIgnoreCase("EMAIL")){
            this.strategy.add(new EmailStrategy());
        }else if(strategy.equalsIgnoreCase("SMS")){
            this.strategy.add(new SmsStrategy());
        }
    }

    void addStrategy(NotificationStrategy strategy){
    this.strategy.add(strategy);
}
    @Override
    void update(String message) {
      for(NotificationStrategy strat: strategy){
          strat.sendNotification(message);
      }
    }

}
