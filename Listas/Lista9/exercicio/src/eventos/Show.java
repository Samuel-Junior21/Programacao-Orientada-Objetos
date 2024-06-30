package eventos;

import java.util.ArrayList;

public class Show extends Evento{

    private ArrayList<String> artistas;

    

    public Show(String nome,String local,String data,ArrayList<String> artistas){
        super(nome, local, data);
        this.artistas = artistas;
    }
    
    public void setArtistas(ArrayList<String> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<String> getArtistas() {
        return artistas;
    }

    @Override
    public void exibirIformacoes() {
        System.out.println("Informações sobre o show: ");
        
        super.exibirIformacoes();
        for(String artista : artistas ) {
            System.out.println("Artistas do show: " + artista);
        }
    }

    @Override
    public void comecarEvento(){
        System.out.println("O show vai começar!");
    }
    public void comecarEvento(boolean comAplausos){
        if(comAplausos){
            System.out.println("Aplausos!!");
            System.out.println();
            
        } else {
            System.out.println("Não são necessários aplausos...");
            System.out.println();
        }
    }
}
