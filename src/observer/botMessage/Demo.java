package observer.botMessage;

import observer.botMessage.brain.BotMessage;
import observer.botMessage.channels.*;
import observer.botMessage.config.Message;

public class Demo {
    public static void main(String[] args) {
        System.out.println("**** Bot Message ****");

        Message message = new Message("O fim está proximo");

        Email email = new Email();
        Facebook facebook = new Facebook();
        Instagram instagram = new Instagram();
        WhatsApp whatsApp = new WhatsApp();
        YouTube youTube = new YouTube();

        BotMessage botMessage = new BotMessage();

        botMessage.addObserver(email);
        botMessage.addObserver(facebook);
        botMessage.addObserver(instagram);
        botMessage.addObserver(whatsApp);
        botMessage.addObserver(youTube);

        botMessage.listObservers(message);
    }
}
