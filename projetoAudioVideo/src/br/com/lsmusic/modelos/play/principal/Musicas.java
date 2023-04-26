package br.com.lsmusic.modelos.play.principal;

import br.com.lsmusic.modelos.play.avaliacoes.Classificavel;

//Criar: nomeMusica, cantor, duracaoMinutos, anoLancamento, avaliacoes, somaAvaliacoes
public class Musicas extends Principais implements Classificavel {
    private String nomeCantor;

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }

    public void fichaMusica() {
        System.out.println("O nome da musica e: " + getNome());
        System.out.println("A duracao da musica e de: " + getTempoDuracao());
        System.out.println("O nome do(a) cantor(a) e: " + getNomeCantor());
        System.out.println("O ano de lancamento da musica e de: " + getAnoLancamento());
        System.out.println("A media de avaliacao foi de " + media());
        System.out.println("O total de visualizacoes foi de: " + getTotalVisualizacoes());
    }

    @Override
    public int getClassificacao() {
        return (int) media();
    }
}
