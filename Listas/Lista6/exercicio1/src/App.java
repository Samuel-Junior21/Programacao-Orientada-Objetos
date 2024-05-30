import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) throws Exception {

       Carro carro = new Carro("Chevrolet", "Cobalt");
       Moto moto = new Moto("Muito Forte", "XJ6");

       System.out.println("Carro: ");
       carro.acelerar();
       carro.frear();

       System.out.println("\nMoto: ");
       moto.acelerar();
       moto.frear();
    }
}
