import components.interfaces.INavegador;
import components.interfaces.IPlayer;
import components.interfaces.ITelefone;

public class Iphone {
    public Iphone(ITelefone telefone, IPlayer player, INavegador navegador) {
        this.telefone = telefone;
        this.player = player;
        this.navegador = navegador;
    }
    private ITelefone telefone;
    
    private IPlayer player;
  
    private INavegador navegador;  
    
        
        public ITelefone telefone() {
            return telefone;
        }

        public IPlayer player() {
            return player;
        }

        public INavegador navegador() {
            return navegador;
        }

}
