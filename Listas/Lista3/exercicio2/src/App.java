import java.util.Scanner;

public class App {

    static double[] notas;
    static Scanner scanner = new Scanner(System.in);

   public static void receberNotas() {
        notas = new double[3];
   
        for (int i = 0; i < notas.length; i++) {
          
            notas[i] = scanner.nextDouble();
   
    }
  }

  public static void imprimirMedia() {
    double soma = 0;

    for (double nota : notas) {
        soma += nota;
    }

    double media = soma / notas.length;
    
    long mediaArredondada = Math.round(media);

    
    System.out.println(mediaArredondada);
  }

  public static void main(String[] args) {
    receberNotas();
    imprimirMedia();
  }
}
