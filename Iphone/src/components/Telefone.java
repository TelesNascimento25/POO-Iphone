package components;

import components.interfaces.ITelefone;

public class Telefone implements ITelefone{
    @Override
    public void iniciarCorreioVoz() {
       System.out.println("Telefone: Iniciando Correio de Voz");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Telefone: Atendendo Chamada");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Telefone: Fazendo Ligação");
    }
    
}
