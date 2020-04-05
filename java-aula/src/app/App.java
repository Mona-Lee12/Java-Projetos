package app;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {     
        
        Scanner s = new Scanner(System.in);
        System.out.println("Iniciando as partidas da Rodada do Brasileirão.");
        
        for(int i = 1; i <= 3; i++) {
            System.out.println("\nVai começar a partida número "+i);
            System.out.println("Entre com o Time 1:");
            String _timeLocal = s.next();
            System.out.println("\nEntre com o Time 2:");
            String _timeVisitante = s.next();

            System.out.println("\nPreparando jogo n° "+i);
            Time timeLocal = new Time();
            timeLocal.setNome(_timeLocal);
            timeLocal.listar();
            System.out.println("\n");

            Time timeVisitante = new Time();
            timeVisitante.setNome(_timeVisitante)
            ;
            timeVisitante.listar();

            Object[] options = {"Sim","Não"};
            int continuar = JOptionPane.showOptionDialog(null,"Pronto para iniciar a partida?","",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null,options,options[0]);
            
            if(continuar == 0){
                Partida primeiraPartida = new Partida();
                primeiraPartida.iniciarPartida(timeLocal, timeVisitante);
            
                System.out.println("\nÍnicio de Jogo. Partida Iniciada !!!");
                primeiraPartida.mostrarResultado();
                System.out.println("\n");
                timeLocal.listar();
                System.out.println("\n");
                timeVisitante.listar();
                System.out.println("*********************************************************");
            }else{
                break;
            }
        }
        
        System.out.println("*********************************************************");
        System.out.println("*********************FIM DE RODADA***********************");
        System.out.println("*********************************************************");
        System.out.println("Integrantes do grupo:\nMichael Nascimento\nMona-Lee Braga");
        System.out.println("*********************************************************");
        System.out.println("GitHub: https://github.com/Mona-Lee12/Java-Projetos");
        System.out.println("*********************************************************"); 
        System.out.println("Video: https://youtu.be/eQEKsEMNG9A");

       s.close();
    }
}