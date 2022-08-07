package Ecommerce.service;

import Ecommerce.model.Cartao;
import Ecommerce.model.Endereco;

public interface ICompraService {

    void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
