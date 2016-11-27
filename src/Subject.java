import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> subscriberList;

    public Subject(){
        subscriberList = new ArrayList();
    }
    public void subscribeObserver(Observer subscriber ){
        subscriberList.add(subscriber);
    }
    public void unsubscribeObserver(Observer subscriber){
        subscriberList.remove(subscriber);
    }
    public void notifyObserver(){
        for(Observer o :subscriberList){
            o.update(this);
        }
    }
}