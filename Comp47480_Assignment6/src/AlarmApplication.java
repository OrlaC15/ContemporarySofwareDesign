
public class AlarmApplication {
  public static final int SECONDS_IN_DAY = 86400;
  public static void main(String[] args) {
    AlarmClock alarmClock = new AlarmClock();
    AlarmClock alarmClock2 = new AlarmClock();


    Person jack = new Person(alarmClock,"Jack");

    Person jill = new Person(alarmClock,"Jill");
    Cron c= new Cron(alarmClock2);
    Person john = new Person(alarmClock,"John");
    alarmClock.setAlarmTime(7, 30, 0);
    alarmClock2.setAlarmTime(15, 30, 0);
    for (int i=1; i<=SECONDS_IN_DAY; i++){
      alarmClock.tick();
      alarmClock2.tick();
      }
    }
  }
  

