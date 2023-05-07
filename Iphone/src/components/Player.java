package components;

import components.interfaces.IPlayer;

public class Player implements IPlayer{
    @Override
    public void selecionarMusica() {
        System.out.println("Player: Selecionando Música");        
    }

    @Override
    public void pausarMusica() {
        System.out.println("Player: Pausando Música");
        
    }

    @Override
    public void tocarMusica() {
        System.out.println("Player: Tocando Música");  
    }

    
}
