import java.util.Scanner;

public class App {


    public static void compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras sao identicas");
            return;
        }

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
            return;
        }

        System.out.println("As palavras sao diferentes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();

        compararPalavras(palavra1, palavra2);

        scanner.close();
    }
}

