package animais;

public class Gato implements Animal{
    private String nome;
    private String raca;

    public Gato(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void comer() {
        System.out.println(nome + " " + raca + " está comendo petiscos.");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " " + raca + " emitiu seu primeiro som... MIIAAAUU!!");
    }
}
