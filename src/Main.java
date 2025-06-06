import templateMethod.Bombeiro;
import templateMethod.Eletricista;
import templateMethod.Trabalhador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Loading...");

        Trabalhador tr1 = new Bombeiro();
        Trabalhador tr2 = new Eletricista();

        tr1.executar();
        tr2.executar();
    }
}