package org.example;

import org.example.util.Cliente;
import org.example.util.Produto;

public class App 
{
    public static void main( String[] args )
    {
        Produto blusa = new Produto("blusa", 19.9);
        Produto vestido = new Produto("vestido", 55.9);
        Produto colar = new Produto("colar", 60.7);
        Cliente maria = new Cliente("Maria");

        maria.adicionarProdutoAoCarrinho(blusa);
        maria.adicionarProdutoAoCarrinho(vestido);
        maria.adicionarProdutoAoCarrinho(colar);

        maria.exibirCarrinho();
        maria.exibirTotal();
    }
}
