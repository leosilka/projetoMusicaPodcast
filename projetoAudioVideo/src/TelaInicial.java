import br.com.lsmusic.modelos.play.principal.Musicas;
import br.com.lsmusic.modelos.play.principal.Podcast;
import br.com.lsmusic.modelos.play.principal.Principais;
import br.com.lsmusic.modelos.play.principal.Usuarios;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class TelaInicial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            Usuarios inicioPrograma = new Usuarios();
            inicioPrograma.lsMusic();
            System.out.println("""
                 ----------------------------------
                | [1] - Iniciar Programa           |
                | [9] - Encerrar Programa          |
                 ----------------------------------
                """);

            System.out.printf("Selecione uma das opcoes acima: ");
            int selecionaOpcao = leitor.nextInt();
            leitor.nextLine();
            String resposta;
            switch (selecionaOpcao) {
                case 1:
                    Usuarios cadastro = new Usuarios();
                    System.out.printf("Informe o seu nome: ");
                    cadastro.setNome(leitor.nextLine());
                    System.out.printf("Informe a sua idade: ");
                    cadastro.setIdade(leitor.nextInt());
                    leitor.nextLine();
                    System.out.println("");
                    cadastro.fichaUsuario();
                    System.out.println("");
                    String avaliacaoDeMusica;
                    String avaliacaoDePodcast;
                    System.out.printf("Deseja avaliar alguma musica? [S/N] ");
                    avaliacaoDeMusica = leitor.nextLine().toUpperCase();
                    if (avaliacaoDeMusica.equals("S")) {
                        Musicas cadastroMusica = new Musicas();
                        System.out.printf("Informe o nome da musica: ");
                        cadastroMusica.setNome(leitor.nextLine());
                        System.out.printf("Informe a duracao da musica " + cadastroMusica.getNome() + ": ");
                        cadastroMusica.setTempoDuracao(leitor.nextDouble());
                        leitor.nextLine();
                        System.out.printf("Informe o nome do cantor: ");
                        cadastroMusica.setNomeCantor(leitor.nextLine());
                        System.out.printf("Qual o ano de lancamento desta musica? ");
                        cadastroMusica.setAnoLancamento(leitor.nextInt());
                        System.out.printf("Quantas visualizacoes tem essa musica? Esta sera a quantidade de avaliacoes " +
                                "que tera que realizar: ");
                        cadastroMusica.setTotalVisualizacoes(leitor.nextDouble());
                        leitor.nextLine();
                        int contador = 1;
                        while (contador <= (int) cadastroMusica.getTotalVisualizacoes()) {
                            Principais avaliacaoMusica = new Principais();
                            System.out.printf("Qual a nota " + contador + " voce da para esta musica? (0 a 10): ");
                            cadastroMusica.avalia(leitor.nextInt());
                            contador++;
                        }
                        leitor.nextLine();
                        System.out.println("");
                        cadastroMusica.fichaMusica();

                    } else if (avaliacaoDeMusica.equals("N")) {
                        System.out.printf("Deseja avaliar algum podcast? [S/N] ");
                        avaliacaoDePodcast = leitor.nextLine().toUpperCase();
                        if (avaliacaoDePodcast.equals("S")) {
                            Podcast cadastroPodcast = new Podcast();
                            System.out.printf("Informe o nome do programa: ");
                            cadastroPodcast.setNome(leitor.nextLine());
                            System.out.printf("Informe o nome do convidado: ");
                            cadastroPodcast.setNomeConvidado(leitor.nextLine());
                            System.out.printf("Informe o nome do entrevistador: ");
                            cadastroPodcast.setNomeEntrevistador(leitor.nextLine());
                            System.out.printf("Informe a duracao do " + cadastroPodcast.getNome() + ": ");
                            cadastroPodcast.setTempoDuracao(leitor.nextDouble());
                            System.out.printf("O ano de lancamento: ");
                            cadastroPodcast.setAnoLancamento(leitor.nextInt());
                            System.out.printf("Qual o total de visualizacoes? Este sera a quantidade de avaliacoes a serem feitas: ");
                            cadastroPodcast.setTotalVisualizacoes(leitor.nextDouble());
                            leitor.nextLine();
                            int contador = 1;
                            while (contador <= (int) cadastroPodcast.getTotalVisualizacoes()) {
                                System.out.printf("Qual a nota " + contador + " voce da para este programa? (0 a 10): ");
                                cadastroPodcast.avalia(leitor.nextInt());
                                contador++;
                            }
                            leitor.nextLine();
                            System.out.println("");
                            cadastroPodcast.fichaPodcast();
                        } else {
                            continuar = false;
                        }
                    }
                case 9:
                    return;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }
    }
}