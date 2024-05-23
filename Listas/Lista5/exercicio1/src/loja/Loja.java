package loja;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private String endereco;
    private ArrayList<Produto> produtos;

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public ArrayList<Produto> getProdutos() {
    return produtos;
}

public void adicionarProduto(Produto produto) {
    produtos.add(produto);
}

public void listarProdutos() {
    if (produtos.isEmpty()) {
        System.out.println("Nenhum produto cadastrado na loja.");
    } else {
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println("----------------------------------------");
        }
    }
}
}