import java.util.LinkedList;
import java.util.List;

public class Gojek extends Subject {
    public List<String> order;

    public Gojek(){
        this.order = new LinkedList<String>();
    }

    public void addOrder(String newOrder){
        this.order.add(newOrder);
        this.notifyObserver();
    }

    public List<String> getOrder(){
        return this.order;
    }
}
