package Bank;

import Bank.service.FuncionarioBanco;
import Bank.service.impl.Diretor;
import Bank.service.impl.ExecutivoDeConta;
import Bank.service.impl.Gerente;

public class Main {
    public static void main(String[] args) {
        FuncionarioBanco handlerBase = new ExecutivoDeConta().setSeguinteFuncionario(new Gerente().setSeguinteFuncionario(new Diretor()));
        handlerBase.processarSolicitacao(78000);
    }
}
