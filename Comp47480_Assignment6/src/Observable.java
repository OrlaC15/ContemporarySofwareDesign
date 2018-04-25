import java.util.ArrayList;
import java.util.List;

/**
 * Created by Orla on 24/04/2018.
 */
public abstract class Observable {
    List<Observer> o= new ArrayList<>();
     public void attachObserverr(Observer observer){
         o.add(observer);

    }

    public void notifyObserver(){
for (int i =0; i<o.size();i++){
    o.get(i).update();


}
    }

    public void detachObserver(Observer observer){
        o.remove(observer);
    }

//    public Object getUpdate(){
//
//    }



}
