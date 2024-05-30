package animais;

public class Cachorro implements Animal {

    private String raca;
    private int idade;

    public Cachorro(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void comer() {
        System.out.println(raca + " de " + idade + " anos " + "está comendo fígado para se manter forte.");
    }

    @Override
    public void emitirSom() {
        System.out.println(raca + " está latindo bem baixinho: au, au, au!");
    }
}
