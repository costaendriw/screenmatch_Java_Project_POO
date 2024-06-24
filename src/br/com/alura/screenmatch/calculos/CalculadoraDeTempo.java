package br.com.alura.screenmatch.calculos;



import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {                 |   |
//        tempoTotal += f.getDuracaoEmMinutos();    |   |
//    }                                             |   |
//                                                  |   |
//    public void inclui(Series s) {                |   |
//        tempoTotal += s.getDuracaoEmMinutos();    |   |
//    }                                             V   V

    //Método em polimorfismo colocando titulo como referência com a chamada de tempo de duração.
    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
