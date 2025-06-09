package observer.botMessage.channels;

import observer.botMessage.config.Message;
import observer.botMessage.config.Observer;

public class YouTube implements Observer {
    @Override
    public void update(Message message) {
        System.out.println(" Mensagem recebida via YouTube: " + message.toString());
    }
}