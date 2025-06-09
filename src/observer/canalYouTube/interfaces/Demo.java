package observer.canalYouTube.interfaces;

import observer.canalYouTube.interfaces.users.CanalYoutube;
import observer.canalYouTube.interfaces.users.InscritoDoCanal;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Padrão de Projeto Observer");

        CanalYoutube canalYoutube = new CanalYoutube();

        InscritoDoCanal inscrito01 = new InscritoDoCanal("Danizinha ");
        InscritoDoCanal inscrito02 = new InscritoDoCanal("Dowglas ");

        canalYoutube.salvarObservador(inscrito01);
        canalYoutube.salvarObservador(inscrito02);

        canalYoutube.postarNovoVideo("Hello My Friend");

        canalYoutube.notificarObservador();
    }
}
