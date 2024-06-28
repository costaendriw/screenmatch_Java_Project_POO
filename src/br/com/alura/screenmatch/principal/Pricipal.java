package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Pricipal {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        //favorito.setNome("The Matrix");
        //favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.avalia(5);
        favorito.avalia(8);
        favorito.avalia(10);
        

        Filme outro = new Filme("John Wick", 2014);
        //outro.setNome("John Wick");
        //outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Series serie = new Series("La Casa de Papel", 2017);
       // serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        // Podemos usar var para definir que é o filmeDoEndriw é um filme,
        // usando como forma uma inferência.
        var filmeDoEndriw = new Filme("Tutuzilla", 2024);
        // filmeDoEndriw.setNome("Tutuzilla"); //Nome referente ao meu gato Tutu!
        filmeDoEndriw.setDuracaoEmMinutos(180);
        //filmeDoEndriw.setAnoDeLancamento(2024);
        filmeDoEndriw.avalia(10);

        // Como eu quero criar uma lista dos filmes existentes,
        // vou esta criando um ArrayList<object> = new ArrayList<>();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoEndriw);
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);
        // O método size, da classe ArrayList, serve justamente para indicar a quantidade atual de elementos da lista.
        System.out.println("Taamanho da lista " + listaDeFilmes.size());
        // .get(i index) -> retorna a um ‘item’ da lista usando como referência o indice.
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        // toString foi remodelado para retrnar o filme: Nome do filme + ano de lancamento na classe Filme;
        System.out.println("toString do filme:  " + listaDeFilmes.get(0).toString());









    }
}