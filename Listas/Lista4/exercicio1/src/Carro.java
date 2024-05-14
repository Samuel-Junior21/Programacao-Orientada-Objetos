public class Carro {
    String modelo;
    String anoCarro;
    boolean alinhado;
    boolean revisaoEmDia;

    public void veiculo() {
        if (modelo == "Creta" && anoCarro == "2024") {
            System.out.println("Carro Atual!");
        } else {
            System.out.println("Carro Antigo...");
        }
    }

    public void alinhamento() {
        if (alinhado == true) {
            System.out.println("O carro está alinhado!");
        } else {
            System.out.println("O carro precisa ser alinhado o mais rápido possível!");
        }
    }

    public void revisao(){
        if (revisaoEmDia == true) {
            System.out.println("O carro está revisado!");
        } else {
            System.out.println("O carro precisa ser revisado!");
        }
    }

    public void statusCarro(){
        System.out.println("O carro " + modelo + " do ano " + anoCarro + " está alinhado? " + alinhado + ", e revisado? " + revisaoEmDia);
    }



}
