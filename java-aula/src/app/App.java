package app;

public class App {
    public static void main(String[] args) throws Exception {
        Partida partida = new Partida();
        partida.iniciarPartida("Flamengo", "Fluminense");
        partida.mostrarResultado();        
    }
}