/**
 * Created by Orla on 24/04/2018.
 */
public class Cron implements Observer{
    AlarmClock alarmClock;
    String alarmtime;
    public Cron(AlarmClock alarm){

        alarmClock=alarm;
        alarmtime=alarm.getAlarmTime();
        alarmClock.attachObserverr(this);
    }

    public void wakeUp(){
        System.out.println("Cron  doesnt want to wake up  "+alarmtime);

    }


public void update() {
       alarmtime=alarmClock.getAlarmTime();
       if (alarmClock.alarmReached())
       wakeUp();

    }

    private String name;
}
