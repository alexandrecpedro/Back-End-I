package Ecommerce.service.impl;

import Ecommerce.model.Produto;

import java.util.List;

public class ArmazemService {
    /** Attribute **/
    private List<Produto> produtos;

    /** Constructor **/
    public ArmazemService(List<Produto> produtos) {
        this.produtos = produtos;
    }

    /** Method **/
    public Produto buscarProduto(String produtoId, Integer quantidade) {
        Produto produto = null;
        for (Produto p : this.produtos) {
            if (p.getProdutoId().equals(produtoId) && p.getQuantidade() >= quantidade)
                produto = p;
            p.setQuantidade(p.getQuantidade() - quantidade); // atualizamos a quantidade
            produto.setQuantidade(quantidade);
        }

        return produto;
    }
}
