package eventos;

public class StandUp extends Evento{
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante){
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirIformacoes() {
        System.out.println("Informações sobre o StandUp: ");
        super.exibirIformacoes();
        System.out.println(comediante);
    }

    @Override
    public void comecarEvento() {
        System.out.println("Atenção, esta começando agora a chuva de piadas mais escrotas já vistas!!");
    }

    public void comecarEvento(String piada){
        System.out.println("Hahaha, que piada engraçada!");
    }



}
