package org.example.carrinho;

import lombok.Data;
import org.example.produto.Produto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Data
public class Carrinho {
    Logger LOGGER = LoggerFactory.getLogger(Carrinho.class);

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
            LOGGER.info(produto.getNome());
        }
    }

    public void calcularTotalCarrinho() throws Exception {
            for(Produto produto : produtosNoCarrinho) {
                if(produto.getPreco() <= 0) {
                    throw new Exception();
                }
                total += produto.getPreco();
                LOGGER.debug(String.valueOf(total));
            }
    }
}