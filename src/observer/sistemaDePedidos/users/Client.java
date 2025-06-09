package observer.sistemaDePedidos.users;

import observer.sistemaDePedidos.interfaces.Observer;

public class Client implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println(mensagem);
    }
}
