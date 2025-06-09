package observer.sistemaDePedidos.users;

import java.util.List;
import java.util.LinkedList;
import observer.sistemaDePedidos.interfaces.Observer;
import observer.sistemaDePedidos.interfaces.Subject;

public class Store implements Subject {
    List<Observer> observers = new LinkedList<>();
    private String mesenger;

    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    public void mesengerMethod(String mesenger) {
        this.mesenger = mesenger;
    }

    @Override
    public void listObservers() {
        for(Observer obs : observers) {
            obs.update(mesenger);
        }
    }
}
