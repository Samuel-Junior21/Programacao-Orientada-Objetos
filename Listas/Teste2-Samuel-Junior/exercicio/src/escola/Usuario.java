package escola;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email){

    setNome(nome);
    setEmail(email);

    }

    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email; 
    }

    public String setEmail(String email){
        this.email = email;     
    }

}

