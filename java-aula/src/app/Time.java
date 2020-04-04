package app;

class Time {

    private String nome;
    private int qtdVitorias;
    private int qtdEmpates;
    private int qtdDerrotas;
    private int qtdPontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVitorias() {
        return qtdVitorias;
    }

    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }

    public int getQtdEmpates() {
        return qtdEmpates;
    }

    public void setQtdEmpates(int qtdEmpates) {
        this.qtdEmpates = qtdEmpates;
    }

    public int getQtdDerrotas() {
        return qtdDerrotas;
    }

    public void setQtdDerrotas(int qtdDerrotas) {
        this.qtdDerrotas = qtdDerrotas;
    }

    public int getQtdPontos() {
        return qtdPontos;
    }

    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos;
    } 

    @Override
    public String toString() {
        return "Time [nome=" + nome + ", qtdDerrotas=" + qtdDerrotas + ", qtdEmpates=" + qtdEmpates + ", qtdPontos="
                + qtdPontos + ", qtdVitorias=" + qtdVitorias + "]";
    }
    
}