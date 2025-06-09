package observer.botMessage.brain;

import java.util.List;
import java.util.LinkedList;
import observer.botMessage.config.Message;
import observer.botMessage.config.Subject;
import observer.botMessage.config.Observer;

public class BotMessage implements Subject {
    List<Observer> observersList = new LinkedList<>();

    @Override
    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void listObservers(Message message) {
        for(Observer obs : observersList) {
            obs.update(message);
        }
    }
}
