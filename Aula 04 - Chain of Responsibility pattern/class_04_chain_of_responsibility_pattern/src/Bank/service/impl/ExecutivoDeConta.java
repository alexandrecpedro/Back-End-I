package Bank.service.impl;

import Bank.service.FuncionarioBanco;

public class ExecutivoDeConta extends FuncionarioBanco {

    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia < 60000)
            System.out.println("Eu estou encarregado de administrar isso. Executivo de Conta");
        else if (this.seguinteFuncionario != null)
            this.seguinteFuncionario.processarSolicitacao(quantia);

    }
}
