import java.util.Scanner;

public class Exercicio {
    private static final int QTDE_PERGUNTAS = 2;
    private static final int QTDE_TENTATIVAS = 1;
    
    private static final String[] RESPOSTAS = new String[QTDE_PERGUNTAS];
    private static final String[] GABARITO = new String[QTDE_PERGUNTAS];
    private static final Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        String nomeJogador = nomeJogador();

        iniciarQuiz(nomeJogador);

        primeiraPergunta(nomeJogador);

        SegundaPergunta(nomeJogador);

        resultadoDoQuiz(nomeJogador);
    }
   
        /* Da a Liberdade do Jogador escrever o nome */
    public static String nomeJogador(){
       System.out.println(
            """
            Bem vindo ao quiz!
            Pronto para inicar?!
            
            Digite o seu nome:
            """);
        
        return formatarNome(SCAN.nextLine());
    }
          /*Formata o nome do jogador para ficar somente com a primeira letra Maiúscula */
          public static String formatarNome(String nome){
            if(nome.isBlank() || nome.isEmpty()){
                return "Espaço vazio";
            }
            nome = nome.trim();
    
            String[] nomeGrudado = nome.split(" ");
            String analisandoNome = nomeGrudado[0];
            
            String dividindoNome = String.valueOf(analisandoNome.charAt(0));
            String primeiraLetra = dividindoNome;
            
            String nomeSemPrimeiraLetra = analisandoNome.substring(1);
    
            String nomeModificado = primeiraLetra.toUpperCase() + nomeSemPrimeiraLetra.toLowerCase();
    
            return nomeModificado; 
        }

   
            /*Regra do quiz e inicia o mesmo */
    public static void iniciarQuiz(String nomeJogador){
        
        System.out.println(String.format(
            """
        
            Olá novamente %s!!!
            Antes de iniciarmos, você precisa saber de algo importante para que você não acabe errando por besteira, se a letra que você escolher como resposta for diferente
            das disponíveis, vai ser considerado ERRADA! Só porque você ou não leu o aviso ou achou que era o sabe tudo...

            TOME MUITO CUIDADO !!

            após ler a mensagem, pressione a tecla "ENTER".     
            """, nomeJogador
        ));

        SCAN.nextLine();
    }

    
    /* Mostra a primeira pergunta e armazena a resposta do usuario */
    public static void primeiraPergunta(String nome){
        String resposta = "";
        
        do{
            System.out.println(
                """
                1 - Normalmente, quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?

                a. Tem entre 2 a 4 litros. São retirados 450 mililitros. 
                b. Tem 10 litros. São retirados 450 mililitros. 
                c. Tem entre 4 a 6 litros. São retirados 450 mililitros.
                d. Tem 7 litros. São retirados 1,5 litros.
                e. Tem 0,5 litros. São retirados 0,5 litros.  
                """
            );

            resposta = SCAN.nextLine();
        
        }while(!acertouAPergunta(resposta));
        
        GABARITO[0] = "C";
        RESPOSTAS[0] = resposta;

    }

    public static boolean acertouAPergunta(String resposta){
        if(resposta.isBlank()){
            System.out.println(
                """
                Oque eu te disse seu louco?!
                Vou te deixar ir, mas da próxima não terei misericórdia.
                        
                """
            );
            return false;
        }

        return true;
 
    }

    public static void SegundaPergunta(String nome){
        String resposta = "";
        
        do{
            
            
            System.out.println(
                """
                
                2 - Vamos para a segunda pergunta... (Caso você acerte, vamos para a ultima pergunta!)

                De quem é a frase "Penso, logo existo"?
                        
                a. Descartes     b. Galileu Galilei
               
                c. Platão     d. Sócrates
                
                """
            );

            resposta = SCAN.nextLine();
        
        }while(!acertouAPergunta2(resposta));

        RESPOSTAS[1] = resposta;
        GABARITO[1] = "A";

    }

    public static boolean acertouAPergunta2(String resposta){
        if(resposta.isBlank()){
            System.out.println(
            """
            Oque eu te disse?       
            Mais uma chance porque sou bonzinho...
            """
            );
            return false;
        }

        return true;
        
    }

    public static void resultadoDoQuiz(String nomeJogador){
        System.out.println(String.format(
        """
        
        %s,Esse quiz foi extremamente curto, porém foi apenas um protótipo... E com isso, vamos para seus resultado!! 
       QUE RUFEM OS TAMBORES... TTTTRRRRRRRRRRRRRR!!!     
        """,
        nomeJogador
        ));

        for(int i = 0; i < QTDE_PERGUNTAS; i++){
            System.out.println(String.format(
            "%s - %s",
                (i + 1), RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "CORRETO" : "INCORRETO"
            )); 
        }
    }
}