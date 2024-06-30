package excecoes;

public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("Preco negativo ou invalido. Por favor Tente novamente");
    }

}
