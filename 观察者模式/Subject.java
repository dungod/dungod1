package Test;

import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> observers=new ArrayList<Observer>();
    public void attach(Observer observer)
    {
        observers.add(observer);
    }
    public void detach()
    {
        for(Observer observer:observers)
        {
            observer.update();
        }
    }
}
