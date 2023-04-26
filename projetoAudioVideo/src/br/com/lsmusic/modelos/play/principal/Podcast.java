package br.com.lsmusic.modelos.play.principal;

//Criar: nomeEntrevistador, nomeConvidado, nomePrograma, tempoDuracao

import br.com.lsmusic.modelos.play.avaliacoes.Classificavel;

public class Podcast extends Principais implements Classificavel {
    private String nomeEntrevistador;
    private String  nomeConvidado;

    public String getNomeEntrevistador() {
        return nomeEntrevistador;
    }

    public void setNomeEntrevistador(String nomeEntrevistador) {
        this.nomeEntrevistador = nomeEntrevistador;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public void fichaPodcast() {
        System.out.println("Nome do programa: " + getNome());
        System.out.println("Nome do entrevistador: " + getNomeEntrevistador());
        System.out.println("Nome do convidado: " + getNomeConvidado());
        System.out.println("Duracao do " + getNome() + ": " + getTempoDuracao());
        System.out.println("Nota media: " + media());
        System.out.println("Total de Visualizacoes: " + getTotalVisualizacoes());
    }

    @Override
    public int getClassificacao() {
        return (int) media();
    }
}
