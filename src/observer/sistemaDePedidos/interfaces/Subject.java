package observer.sistemaDePedidos.interfaces;

public interface Subject {
    void addObservers(Observer observer);
    void removeObserver(Observer observer);
    void listObservers();
}
