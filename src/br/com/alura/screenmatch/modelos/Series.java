package br.com.alura.screenmatch.modelos;

public class Series extends Titulo {
    //Atributos
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    //Construtor
    public Series(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //Getter e Setter
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // A anotação @Override possibilita a sobrescrita de um método.
    /// Método que mostra quanto tempo de duração será de cada série.
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
