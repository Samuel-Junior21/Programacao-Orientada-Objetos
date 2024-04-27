import java.util.Scanner;

public class App {
    
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_MATRIZ = 4;
    

    public static void main(String[] args) throws Exception {
        boolean[][] matriz = new boolean[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

        int linhas = Integer.parseInt(SCAN.nextLine());
        int colunas = Integer.parseInt(SCAN.nextLine());
        preencherMatriz(matriz);

        ativarTorre(matriz, linhas, colunas);

        imprimirMapa(matriz);
    
    }


    public static void preencherMatriz(boolean[][] matriz){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                matriz[i][j] = false;
            }
        }
    }

    
    public static void ativarTorre(boolean[][] matriz, int linha, int coluna){
        matriz[linha][coluna] = true;
    }


    public static void imprimirMapa(boolean[][] matriz){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
           System.out.print("|");
            

           for(int j = 0; j < TAMANHO_MATRIZ; j++){
                if(matriz[i][j]){
                    System.out.print("O|");
                } else{
                    System.out.print("X|");
                } 
            }
          System.out.println();
        }
    }     
}