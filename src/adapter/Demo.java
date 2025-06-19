package adapter;

import adapter.interfaces.ITomadaNova;
import adapter.tomadas.Adaptador;
import adapter.tomadas.TomadaVelha;

public class Demo {
    public static void main(String[] args) {
        TomadaVelha tomadaVelha = new TomadaVelha();
        ITomadaNova adaptador = new Adaptador(tomadaVelha);

        adaptador.conectar();
    }
}
