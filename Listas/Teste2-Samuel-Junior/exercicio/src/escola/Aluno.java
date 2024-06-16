package escola;

public class Aluno extends Usuario {

    private String matricula;
    
    public Aluno(String nome, String email, String matricula){
        setNome(nome);
        setEmail(email);
        setMatricula(matricula);
    }
    
    @Override
    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(email);
        System.out.println(matricula);
    }
    public void exibirInfo(boolean exibirNome , boolean exibirEmail, boolean exibirMatricula){
        System.out.println(setNome);
        System.out.println(setEmail);
        System.out.println(setMatricula);
    }



    public String getMatricula() {
        return matricula;
    }

    public String setNome(String matricula){
        this.matricula = matricula;
    }
}