package org.example;

import org.example.exception.ValorInvalidoException;
import org.example.util.Carrinho;
import org.example.util.Produto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTest {
    @Test
    @DisplayName("deve adicionar produtos no carrinho.")
    public void adicionaProdutoNoCarrinho(){
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("esfoliante", 39);
        carrinho.adicionarProduto(produto1);

        assertEquals(carrinho.getProdutosNoCarrinho().size(), 1);
    }

    @Test
    @DisplayName("deve remover produtos no carrinho.")
    public void removerProdutoNoCarrinho(){
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("esfoliante", 39);
        carrinho.adicionarProduto(produto1);
        carrinho.removerProduto(produto1);

        assertEquals(carrinho.getProdutosNoCarrinho().size(), 0);
    }

    @Test
    @DisplayName("deve retornar o valor total do carrinho.")
    public void CalculaTotalCarrinho(){
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("esfoliante", 39);
        Produto produto2 = new Produto("sabonete", 27);
        final Produto produto3 = new Produto("rímel", 0);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.calcularTotalCarrinho();

        assertEquals(carrinho.getTotal(), 66);
        assertThrows(ValorInvalidoException.class, () -> {
            Carrinho carrinho2 = new Carrinho();
            carrinho2.adicionarProduto(produto3);
            carrinho2.calcularTotalCarrinho();
        });
    }
}
