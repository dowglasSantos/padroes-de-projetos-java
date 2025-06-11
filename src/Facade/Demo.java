package Facade;

import Facade.sistem.LocacaoDeVeiculos;

public class Demo {
    public static void main(String[] args) {
        System.out.println("**** Padrao de Projeto Facade ****");

        LocacaoDeVeiculos locacaoDeVeiculos = new LocacaoDeVeiculos();

        locacaoDeVeiculos.locacao("algum lugar", "algum nome", "algum modelo");
    }
}
