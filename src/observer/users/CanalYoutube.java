package observer.users;

import java.util.List;
import java.util.LinkedList;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

public class CanalYoutube implements Subject {
    List<Observer> observerList = new LinkedList<>();
    private String notificacao;

    @Override
    public void salvarObservador(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deletarObservador(Observer observer) {
        observerList.remove(observer);
    }

    public void postarNovoVideo(String notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void notificarObservador() {
        for(Observer obs : observerList) {
            obs.atualizar(notificacao);
        }
    }
}
