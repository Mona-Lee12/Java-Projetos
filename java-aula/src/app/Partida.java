package app;

import java.util.Random;

public class Partida {

    private Time timeVisitante; 
    private Time timeLocal;     
    private int scoreVisitante;
    private int scoreLocal;

    Random random = new Random();
    // private Date dataPartida;
    
    void iniciarPartida (Time timeLocal, Time timeVisitante) {        
        this.timeLocal = timeLocal;
        this.timeVisitante = timeVisitante;
        this.scoreLocal = random.nextInt(10);
        this.scoreVisitante = random.nextInt(10);       
    }

    void mostrarResultado() {        
        System.out.println(this.timeLocal.getNome() +" "+ scoreLocal+" x "+scoreVisitante+" "+this.timeVisitante.getNome());
    }

    void finalizarPartida() {
        // ...
        if (this.scoreLocal > this.scoreVisitante){
            this.timeLocal.setQtdVitorias(1);
            this.timeLocal.setQtdPontos(3);
            this.timeVisitante.setQtdDerrotas(1);
        }
         
        if (this.scoreLocal < this.scoreVisitante){
            this.timeVisitante.setQtdVitorias(1);
            this.timeVisitante.setQtdPontos(3);
            this.timeLocal.setQtdDerrotas(1);
        }
        
        if (this.scoreLocal == this.scoreVisitante) {
            
            this.timeVisitante.setQtdEmpates(1);
            this.timeVisitante.setQtdPontos(1);
            this.timeLocal.setQtdEmpates(1);
            this.timeLocal.setQtdPontos(1);
        }
    }

}