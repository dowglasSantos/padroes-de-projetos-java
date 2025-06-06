package observer.interfaces;

public interface Subject {
    void salvarObservador(Observer observer);
    void deletarObservador(Observer observer);
    void notificarObservador();
}
