import br.com.lsmusic.modelos.play.principal.Principais;

public class Tempo {
    private double duracaoTotal;

    public double getDuracaoTotal() {
        return this.duracaoTotal;
    }

    public void inclui(Principais principais) {
        System.out.printf("Adiicionando duracao em minutos de " + principais.getNome());
        this.duracaoTotal += principais.getTempoDuracao();
    }
}
