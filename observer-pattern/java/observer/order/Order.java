package observer.order;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject{
    private final List<Observer> observers;
    private String order;
    private int price;
    private String userName;

    public Order(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
    observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    observers.remove(o);
    }

    @Override
    public void notifyObservers() {
    for(Observer observer : observers){
        observer.update( order,  price,  userName);
    }
    }

    public void orderRequest(String order, int price, String userName){
    this.order = order;
    this.price = price;
    this.userName = userName;
    notifyObservers();
    }
}
