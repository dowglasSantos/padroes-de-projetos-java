package Facade.sistem;

import Facade.interfaces.ILocacaoDeVeiculos;

public class LocacaoDeVeiculos implements ILocacaoDeVeiculos {
    String localizacaoVeiculo, nomeLoja, modelo;

    @Override
    public void locacao(String localizacaoVeiculo, String nomeLoja, String modelo) {
        localizacao(localizacaoVeiculo);
        loja(nomeLoja);
        modeloVeiculo(modelo);
    }

    private void localizacao(String localizacao) {
        this.localizacaoVeiculo = localizacao;
        System.out.println("localizacao: " + localizacaoVeiculo);
    }

    private void loja(String loja) {
        this.nomeLoja = loja;
        System.out.println("loja: " + nomeLoja);
    }

    private void modeloVeiculo(String modeloVeiculo) {
        this.modelo = modeloVeiculo;
        System.out.println("modeloVeiculo: " + modelo);
    }
}
