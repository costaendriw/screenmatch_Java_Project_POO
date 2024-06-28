package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Atributo
    private String diretor;

    //Construtor
    /* Em Java, um construtor é um método especial usado para criar e
     inicializar um objeto recém-criado. Quando uma classe é definida,
    ela pode ter um ou mais construtores, sendo que se nenhum construtor for
    definido explicitamente, o Java criará um construtor ‘default’ (padrão) automaticamente.*/

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getter e Setter
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //Reescrit de método
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme:" + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
