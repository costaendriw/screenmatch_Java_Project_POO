package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(8);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);
        var filmeDoEndriw = new Filme("Tutuzilla", 2024);
        filmeDoEndriw.avalia(10);
        Series serie = new Series("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
