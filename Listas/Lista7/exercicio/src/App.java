import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
            Aluno aluno = new Aluno("Samuel Junior", "samuel.junior@aluno.ifsp.edu.br", "3021041");
            Professor professor = new Professor("Junior Samuel", "junior.samuel@ifsp.edu.br", "Programação");
    
            System.out.println("Exibir informações do aluno:");
            aluno.exibirInfo();
            System.out.println();
            aluno.exibirInfo(true, false, true);
            System.out.println();
    
            System.out.println("Exibir informações do professor:");
            professor.exibirInfo();
            System.out.println();
            professor.exibirInfo(false, true, true);
        }
    }

