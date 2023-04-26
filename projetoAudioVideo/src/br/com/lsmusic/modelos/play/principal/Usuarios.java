package br.com.lsmusic.modelos.play.principal;

//Criar: idade
public class Usuarios extends Principais {
    private int idade;

    public void lsMusic() {
        System.out.println("""               
                ██╗     ███████╗    ███╗   ███╗██╗   ██╗███████╗██╗ ██████╗
                ██║     ██╔════╝    ████╗ ████║██║   ██║██╔════╝██║██╔════╝
                ██║     ███████╗    ██╔████╔██║██║   ██║███████╗██║██║    \s
                ██║     ╚════██║    ██║╚██╔╝██║██║   ██║╚════██║██║██║    \s
                ███████╗███████║    ██║ ╚═╝ ██║╚██████╔╝███████║██║╚██████╗
                ╚══════╝╚══════╝    ╚═╝     ╚═╝ ╚═════╝ ╚══════╝╚═╝ ╚═════╝
                                                                          \s                               
                """);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fichaUsuario() {
        System.out.println("Nome do Usuario: " + getNome());
        System.out.println("Idade do Usuario: " + getIdade());
    }
}
