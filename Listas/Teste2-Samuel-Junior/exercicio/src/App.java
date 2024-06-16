public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("João", "joao@gmail.com", "8162432");
        Professor professor = new Professor("Paulo", "paulo@gmail.com", "História");
        
        aluno.exibirInfo();
        aluno.exibirInfo(true, true, false);
        
        professor.exibirInfo();
        professor.exibirInfo(true, false, false);
    }
}
