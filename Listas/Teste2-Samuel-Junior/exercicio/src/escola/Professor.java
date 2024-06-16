package escola;

public class Professor extends Usuario{

    private String disciplina;
    
    public Professor(String nome, String email, String disciplina){
        setNome(nome);
        setEmail(email);
        setDisciplina(disciplina);
    }
    
    @Override
    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(email);
        System.out.println(disciplina);
    }
    public void exibirInfo(boolean exibirNome , boolean exibirEmail, boolean exibirDisciplina){
        System.out.println(setNome);
        System.out.println(setEmail);
        System.out.println(setDisciplina);
    }


    public String getDisciplina() {
        return disciplina;
    }

    public String setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }




















}
