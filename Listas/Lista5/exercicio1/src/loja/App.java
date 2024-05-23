package loja;

public class App {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 21.22, 10);
        Produto produto2 = new Produto("Feijão", 8.78, 50);
        Produto produto3 = new Produto("Batata", 5.35, 15);

        Loja loja = new Loja("Supermercado do Sam", "Rua Primeiro de Maio, 500");

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        System.out.println("Produtos cadastrados no " + loja.getNome() + ":");
        loja.listarProdutos();
    }
}
