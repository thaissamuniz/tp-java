package cliente;

import carrinho.Carrinho;
import produto.Produto;

public class Cliente {
    private String nome;
    private Carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        carrinho.adicionarProduto(produto);
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        carrinho.removerProduto(produto);
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho de " + nome + ":");
        carrinho.exibirProdutosNoCarrinho();
    }

    public void exibirTotal(){
        carrinho.calcularTotalCarrinho();
        System.out.println("valor total: R$" + carrinho.getTotal());
    }
}
