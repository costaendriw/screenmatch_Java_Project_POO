package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;


public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(8);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);
        var filmeDoEndriw = new Filme("Tutuzilla", 2024);
        filmeDoEndriw.avalia(10);
        Series serie = new Series("La Casa de Papel", 2017);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoEndriw);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        /* A forma mais comum de percorrer uma lista no Java é utilizando o laço foreach tradicional,
        também conhecido como for-each. Esse laço permite que se percorra todos os elementos de uma lista,
         sem a necessidade de se preocupar com índices ou o tamanho dela,
         tornando o código mais simples e legível. */
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            //Eu querendo colocar nesta lista uma classificação em estrelas como a class filme possui,
            // tenho que referenciar aqui o código a existência do método reescrevendo. E o melhor jeito de fazer isso é
            //casting.
            // Mas também podemos usar o método instanceof que veio com a atualização do Java 14, estanciando o filme e
            // podemos ainda incluir um e se maior que;
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
//                Filme filme = (Filme) item;  ----------------------------------->//Quando eu crio uma variavel dizendo que é um objeto,
                                                                                   // não é uma cópia do objeto.
                                                                                   //E sim só mudando a forma que o referêncio no código.
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscadorPorArtistas = new ArrayList<>();
        buscadorPorArtistas.add("Adam Sandler");
        buscadorPorArtistas.add("Paulo");
        buscadorPorArtistas.add("Jaqueline");
        buscadorPorArtistas.add("Endriw");
        System.out.println(buscadorPorArtistas);
        //Nessa lista se eu quiser ordenar essa lista em ordem alfabética, usamos a função collections.sort() colocando o objeto como parametro.
        System.out.println("Depois da ordenação");
        Collections.sort(buscadorPorArtistas);
        System.out.println(buscadorPorArtistas);
        // Para eu fazer a ordenação dos nomes dos filmes e series, tive que usar o método CompareTo e implementar
        // na classe Titulo Comparable<Titulo> para fazer a comparação de string e imprimir a lsita ordenada com Collections.sort()
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        // Comparator (que vem de comparador) tem a finalidade de fazer comparacão entre strings da mesma lista existente, sem precisar refazer o
        //método compareTo

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        // Essa é uma sintaxe bem diferente, usando o (::). Diferente do ponto (.), que seria uma invocação de método,
        // esse par de dois pontos serve para referenciar métodos, trabalhar com lambdas, gerar um mecanismo que atribuo a uma interface, entre outras funções.
        // Tem várias coisas acontecendo nessa linha, pois estamos a maneira mais moderna de se ordenar em Java.
        //Estamos usando o .sort() a partir da lista e pedindo para o Comparator, que é uma interface, chamar o método estático comparing().
        // Em seguida, ao invés de passarmos um ano de lançamento,
        // estamos sinalizando que para todo Titulo recebido o getAnoDeLancamento deve ser usado como critério de comparação.

        System.out.println("Ordenando por ano");
        System.out.println(lista);


    }
}
