package Ecommerce.service.impl;

import Ecommerce.model.Cartao;
import Ecommerce.model.Endereco;
import Ecommerce.model.Produto;
import Ecommerce.service.ICompraService;

import java.util.Arrays;
import java.util.Objects;

public class CompraService implements ICompraService {
    /** Attributes **/
    private ArmazemService armazemService;
    private PgtoService pgtoService;
    private EnvioService envioService;

    /** Constructor **/
    public CompraService(ArmazemService armazemService, PgtoService pgtoService, EnvioService envioService) {
        this.armazemService = armazemService;
        this.pgtoService = pgtoService;
        this.envioService = envioService;
    }

    /** Method **/
    @Override
    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco) {
        Produto produto = armazemService.buscarProduto(produtoId, quantidade);
        if (Objects.nonNull(produto)) {
            //Se temos o produto, processamos o pagamento
            if (pgtoService.processarPgto(cartao, String.valueOf(produto.getValor() * quantidade))){
                envioService.processarEnvio(Arrays.asList(produto), endereco);
            }

        }
    }
}
