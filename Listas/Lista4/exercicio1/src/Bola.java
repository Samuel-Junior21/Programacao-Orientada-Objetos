public class Bola {
    String modelo;
    String esporte;
   boolean profissional;

    public void modalidade() {
        if (esporte == "Volei") {
            System.out.println("Bola encontrada!");
        } else {
            System.out.println("Bola inão encontrada!");
        }
    }

    public void comprar() {
        if (modelo == "Mikasa V200w") {
            System.out.println("R$ 600,00");
        } else {
            System.out.println("Produto Indisponível!");
        }
    }

    public void sobre() {
        if (modelo == "Mikasa V200w" && profissional == true && esporte == "Volei") {
            System.out.println("Bola modelo: " + modelo +  ", Modalidade: " + esporte + ", Profissional: " + profissional + ", adquirida! " );
        } else {
            System.out.println("Bola não recomendada!");
        }
    }
}
