package org.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cliente {
    Logger LOGGER = LoggerFactory.getLogger(Cliente.class);
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
        LOGGER.info("Carrinho de " + nome + ":");
        carrinho.exibirProdutosNoCarrinho();
    }

    public void exibirTotal(){
        try {
            carrinho.calcularTotalCarrinho();
        } catch (Exception e) {
            LOGGER.error("O valor não deve ser menor ou igual a 0");
            throw new RuntimeException(e);
        }
        LOGGER.info("valor total: R$" + carrinho.getTotal());
    }
}
