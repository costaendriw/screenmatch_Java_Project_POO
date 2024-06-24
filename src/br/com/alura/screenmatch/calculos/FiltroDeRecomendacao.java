package br.com.alura.screenmatch.calculos;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no moemnto!");
        } else {
            System.out.println("Colque na sua lista para assistir depois");
        }
    }
}
