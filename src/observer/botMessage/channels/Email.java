package observer.botMessage.channels;

import observer.botMessage.config.Message;
import observer.botMessage.config.Observer;

public class Email implements Observer {
    @Override
    public void update(Message message) {
        System.out.println(" Mensagem recebida via E-mail: " + message.toString());
    }
}
