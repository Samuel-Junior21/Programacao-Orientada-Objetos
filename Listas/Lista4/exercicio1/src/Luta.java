public class Luta {
String lutador1;
String lutador2;
String vencedor;
boolean nocaute;
int rounds;
boolean lutaAcabou;



public void iniciarLuta(){

    System.out.println("Estamos com os lutadores " + lutador1 + " e " + lutador2 + ", luta iniciada!");
}

public void nocauteFinalizador(){
    if (nocaute == true) {
        System.out.println("A luta acabou!");
    }
}
public void roundsTotais(){
    if (lutaAcabou == true) {
        System.out.println(rounds);
    }
}

public void resultadosFinais(){
    if (lutaAcabou == true) {
        System.out.println("O vencedor da luta foi: " + vencedor + ", efetuou nocaute? " + nocaute + " em um total de " + rounds + " rounds.");
    }
}



}
