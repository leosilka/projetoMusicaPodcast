package br.com.lsmusic.modelos.play.avaliacoes;

public class FiltroRecomedacao {
    public void filtro(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 10) {
            System.out.println("Esta com uma excelente classificacao!");
        } else if (classificavel.getClassificacao() >= 5) {
            System.out.println("Esta com uma boa classificacao!");
        } else {
            System.out.println("A classificacao nao esta legal no momento!");
        }
    }
}
