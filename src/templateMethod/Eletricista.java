package templateMethod;

public class Eletricista extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como eletricista");
    }
}
