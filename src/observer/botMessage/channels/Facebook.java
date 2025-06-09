package observer.botMessage.channels;

import observer.botMessage.config.Message;
import observer.botMessage.config.Observer;

public class Facebook implements Observer {
    @Override
    public void update(Message message) {
        System.out.println(" Mensagem recebida via Facebook: " + message.toString());
    }
}