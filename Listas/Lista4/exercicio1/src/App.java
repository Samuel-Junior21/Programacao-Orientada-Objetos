public class App {
    public static void main(String[] args) throws Exception {
        Bola bola = new Bola();

        bola.modelo = "Mikasa V200w";
        bola.esporte = "Volei";
        bola.profissional = true;

        bola.modalidade();
        bola.sobre();

        System.out.println();
        
        Carro carro = new Carro();
        
        carro.modelo = "Creta";
        carro.anoCarro = "2024";
        carro.alinhado = true;
        carro.revisaoEmDia = true;
        
        carro.veiculo();
        carro.revisao();
        carro.statusCarro();
        
        System.out.println();

        Luta luta = new Luta();

        luta.lutador1 = "Jose";
        luta.lutador2 = "Mario";
        luta.vencedor = "Jose";
        luta.nocaute = true;
        luta.rounds = 2;
        luta.lutaAcabou = true;

        luta.iniciarLuta();
        luta.nocauteFinalizador();
        luta.resultadosFinais();
    }
}
