import java.util.ArrayList;

import eventos.Show;
import eventos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Rita Lee");
        artistas.add("Chico Buarque");
        artistas.add("Gilberto Gil");
        
        
        Show show = new Show("AL9", "Morumbis", 
        "1 de Abril", artistas);

        show.exibirIformacoes();
        show.comecarEvento();
        show.comecarEvento(true);
        show.comecarEvento(false);


        StandUp comedia = new StandUp("Sam's Club", "Itaquá", "21 de Janeiro de 2025", "Samuel Junior");

        comedia.exibirIformacoes();
        comedia.comecarEvento();
        comedia.comecarEvento("Todas as frutas foram passar as férias na montanha, menos o mamão... Porque o mamão foi papaia!");
    }
}