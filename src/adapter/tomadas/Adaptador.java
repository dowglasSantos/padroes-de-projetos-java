package adapter.tomadas;

import adapter.interfaces.ITomadaNova;

public class Adaptador implements ITomadaNova {
    private TomadaVelha tomadaVelha;

    public Adaptador(TomadaVelha tomadaVelha) {
        this.tomadaVelha = tomadaVelha;
    }

    @Override
    public void conectar() {
        tomadaVelha.status();
    }
}