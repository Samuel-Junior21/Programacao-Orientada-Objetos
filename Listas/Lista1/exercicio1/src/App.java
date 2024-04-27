import java.util.Scanner;

public class App {
    
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TOTAL_NUMEROS = 10;
    public static void main(String[] args){

        int[] numerosListados = nomeDosConvidados();
        int numeroProcurado = Integer.parseInt(SCAN.nextLine());

        boolean encontrado = buscarNumero(numeroProcurado,numerosListados);
        estaListado(encontrado);
    }

    public static int[] nomeDosConvidados(){
        int[] numerosListados = new int[TOTAL_NUMEROS];
        
        for(int i = 0; i < numerosListados.length; i++){
            numerosListados[i] = Integer.parseInt(SCAN.nextLine()); 
        }
        return numerosListados;
    }

    public static boolean buscarNumero(int numeroProcurado, int[] numerosListados){
        for(int i = 0; i < numerosListados.length; i++){
            if(numerosListados[i] == numeroProcurado){
                return true;
            }
        }
        return false;
    }   
     
    public static void estaListado(boolean encontrado){
        if(encontrado){
            System.out.println("ACHEI");
        }
        else{
            System.out.println("NAO ACHEI");
        }
    }
}
