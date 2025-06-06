package templateMethod;

public class Bombeiro extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Tralhando como bombeiro.");
    }
}
