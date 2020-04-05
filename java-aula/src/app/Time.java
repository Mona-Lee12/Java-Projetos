package app;

public class Time implements TimeInterface {
    private String nome;
    private int qtdVitorias;
    private int qtdEmpates;
    private int qtdDerrotas;
    private int qtdPontos;

    //Construtor 
    public Time() {
        this.nome  = "";
        this.qtdVitorias = 0;
        this.qtdEmpates = 0;
        this.qtdDerrotas = 0;
        this.qtdPontos = 0;
    }

    //get e set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDerrotas() {
        return qtdDerrotas;
    }
    public void setQtdDerrotas(int qtdDerrotas) {
        this.qtdDerrotas = qtdDerrotas;
    }


    public int getQtdEmpates() {
        return qtdEmpates;
    }
    public void setQtdEmpates(int qtdEmpates) {
        this.qtdEmpates = qtdEmpates;
    }

    public int getQtdPontos() {
        return qtdPontos;
    }
    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos;
    }

    public int getQtdVitorias() {
        return qtdVitorias;
    }
    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }

    @Override
    public void listar() {
        System.out.println("Time: "+this.nome+"\nVitórias: "+this.qtdVitorias+"\nEmpates: "+this.qtdEmpates+"\nDerrotas: "+this.qtdDerrotas+"\nPontos: "+this.qtdPontos);
    }

}