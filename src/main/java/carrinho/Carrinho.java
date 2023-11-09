package carrinho;

import lombok.Data;
import produto.Produto;

import java.util.ArrayList;
import java.util.List;

@Data
public class Carrinho {
    private List<Produto> produtosNoCarrinho;
    private double total;

    public Carrinho() {
        produtosNoCarrinho = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtosNoCarrinho.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtosNoCarrinho.remove(produto);
    }

    public void exibirProdutosNoCarrinho() {
        for (Produto produto : produtosNoCarrinho) {
            System.out.println("- " + produto.getNome());
        }
    }

    public void calcularTotalCarrinho(){
        for(Produto produto : produtosNoCarrinho) {
            total += produto.getPreco();
        }
    }

}