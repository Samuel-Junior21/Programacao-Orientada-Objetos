import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("PitBull", 12);
        Gato gato = new Gato("Matt", "Siamês");

        System.out.println("Gato: ");
        gato.comer();
        gato.emitirSom();

        System.out.println("\nCachorro: ");
        cachorro.comer();
        cachorro.emitirSom();
    }
}
