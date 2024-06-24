package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Atrinutos
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoPlano;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;


    //Métodos de Acesso

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluindoPlano() {
        return incluindoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public double getSomaDeAvaliacoes() {
        return somaDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluindoPlano(boolean incluindoPlano) {
        this.incluindoPlano = incluindoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método de Ação do objeto
    public void exibiFichaTecnica() {
        System.out.println("Nome do br.com.alura.acreenmatch.modelos.Filme: " + nome);
        System.out.println(("Ano de Lançamento: ") + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia() {
        return somaDeAvaliacoes / totalDeAvaliacao;
    }

    public void setIncluidoNoPlano(boolean b) {
    }
}
