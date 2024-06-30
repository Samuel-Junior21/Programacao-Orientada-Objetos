package eventos;

public abstract class Evento {
    protected String nome;
    protected String local;
    protected String data;

    public Evento(String nome, String local, String data){
        setNome(nome);
        setLocal(local);
        setData(data);
    }

    public void exibirIformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Local: " + getLocal());
        System.out.println("Data: " + getData());
    }

    public abstract void comecarEvento();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }
}
