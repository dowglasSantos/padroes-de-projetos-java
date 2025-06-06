package observer.users;

import observer.interfaces.Observer;

public class InscritoDoCanal implements Observer {
    private String nome;

    public InscritoDoCanal(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " Hacker Etico: " + mensagem);
    }
}
