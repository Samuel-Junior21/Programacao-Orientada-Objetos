package excecoes;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException(){
        super("Nome da loja precisa ter mais de 3 caracteres");
    }
}
