package br.com.lsmusic.modelos.play.principal;

//Criar: nome, anoLancamento, somaAvaliacoes, tempoDuracao
public class Principais {
    //private Scanner leitura = new Scanner(System.in);
    private String nome;
    private int anoLancamento;
    private int somaAvaliacoes;
    private double totalVisualizacoes;
    private double tempoDuracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(double totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public void avalia(int nota) {
        somaAvaliacoes += nota;
    }

    public double media() {
        return somaAvaliacoes / totalVisualizacoes;
    }

    public void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Trate a exceção aqui...
        }
    }
}
