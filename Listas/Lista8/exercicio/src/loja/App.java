package loja;

import java.util.Scanner;

import excecoes.NomeInvalidoException;
import excecoes.PrecoInvalidoException;

public class App {  
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        do{
            try{
                Produto produto = new Produto(
                    scanner.nextLine(), 
                    Double.parseDouble(scanner.nextLine())
                );

                System.out.println(produto.getNome());
                System.out.println(produto.preco);

                break;
            }catch(NomeInvalidoException | PrecoInvalidoException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println("Ocorreu um erro, tente novamente");
            }
        }while(true);
    }
}
