package templateMethod;

public abstract class Trabalhador {
    public void executar() {
        acordar();
        tomarCafe();
        irTrabalhar();
        trabalhar();
        voltarParaCasa();
        descansar();
        dormir();
    }

    private void acordar() {
        System.out.println("Acordando");
    }

    private void tomarCafe() {
        System.out.println("Tomar cafe");
    }

    private void irTrabalhar() {
        System.out.println("Ir trabalhar");
    }

    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("voltar para casa");
    }

    private void descansar() {
        System.out.println("descansar");
    }

    private void dormir() {
        System.out.println("dormir");
    }
}
