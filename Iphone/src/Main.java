
import components.Navegador;
import components.Player;
import components.Telefone;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone(
            new Telefone(),
            new Player(),
            new Navegador()
        );

        iphone.telefone().fazerLigacao();
        iphone.telefone().atenderChamada();
        iphone.telefone().iniciarCorreioVoz();;
        
        iphone.navegador().exibirPagina();
        iphone.navegador().adicionarNovaAba();
        iphone.navegador().atualizarPagina();

        iphone.player().tocarMusica();
        iphone.player().pausarMusica();;
        iphone.player().selecionarMusica();;
    }
}
