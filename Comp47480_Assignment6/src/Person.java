
public class Person implements Observer{
  AlarmClock alarmClock;
  String alarmtime;
  public Person(AlarmClock alarm,String a_name){
    name = a_name;
    alarmClock=alarm;

    //alarmtime=alarm.getAlarmTime();
    alarmClock.attachObserverr(this);
  }
  
  public void goToBed(){
    System.out.println(name + " is going to bed...");
  }
  
  public void wakeUp(){
    System.out.println(name + " has woken up! its "+alarmtime);

  }



  public void update() {
    alarmtime=alarmClock.getAlarmTime();

    if (alarmClock.alarmReached())
    wakeUp();

     }

  private String name;
}
