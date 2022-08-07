package Ecommerce.service.impl;

import Ecommerce.model.Endereco;
import Ecommerce.model.Produto;

import java.util.List;

public class EnvioService {
    /** Method **/
    public void processarEnvio(List<Produto> produtos, Endereco endereco) {
        System.out.println("Enviando produtos a " + endereco.getRua() + ", " + endereco.getNro()
                + " - "+ endereco.getBairro());
    }
}
