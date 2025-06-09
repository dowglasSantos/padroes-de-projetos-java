package observer.botMessage.config;

import observer.botMessage.config.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void listObservers(Message message);
}
