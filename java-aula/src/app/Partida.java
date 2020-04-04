package app;

import java.util.Random;

public class Partida {

    private Time timeVisitante; 
    private Time timeLocal;     
    private int scoreVisitante;
    private int scoreLocal;

    Random random = new Random();
    // private Date dataPartida;
    
    void iniciarPartida (timeLocal, timeVisitante) {        
        this.timeLocal = casa;
        this.timeVisitante = fora;
        this.scoreLocal = random.nextInt(10);
        this.scoreVisitante = random.nextInt(10);             
    }

    void mostrarResultado() {        
        System.out.println(timeLocal +" "+ scoreLocal+" x "+scoreVisitante+" "+timeVisitante);
    }

    void finalizarPartida() {
        // ...
    }

}