package escola;

public class Professor {
    private String disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina);
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina) {
        if (exibirNome) {
            System.out.println("Nome: " + getNome());
        }
        if (exibirEmail) {
            System.out.println("Email: " + getEmail());
        }
        if (exibirDisciplina) {
            System.out.println("Disciplina: " + disciplina);
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
