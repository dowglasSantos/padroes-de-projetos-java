package observer.sistemaDePedidos;

import observer.sistemaDePedidos.users.Client;
import observer.sistemaDePedidos.users.Store;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Sistema de Pedidos");

        Store store = new Store();
        Client client = new Client();

        store.addObservers(client);
        store.mesengerMethod("Black November");
        store.listObservers();
    }
}
