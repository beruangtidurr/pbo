import java.util.LinkedList;
import java.util.List;

public class Subject{
    private List<Observer> observers;

    public Subject(){
        this.observers = new LinkedList<Observer>();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void detacth(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer o : observers){
            o.update();
        }
    }
}