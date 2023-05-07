package components;

import components.interfaces.INavegador;

public class Navegador implements INavegador{
   
    @Override
    public void exibirPagina(){
        System.out.println("Navegador: Exibindo Página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador: Atualizando Página");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador: Adicionando Nova Aba");
        
    }
}
