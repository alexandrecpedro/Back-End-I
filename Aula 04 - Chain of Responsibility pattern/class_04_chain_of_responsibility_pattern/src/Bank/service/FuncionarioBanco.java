package Bank.service;

public abstract class FuncionarioBanco {

    protected FuncionarioBanco seguinteFuncionario;

    public abstract void processarSolicitacao(Integer quantia);

    public FuncionarioBanco setSeguinteFuncionario(FuncionarioBanco seguinteFuncionario) {
        this.seguinteFuncionario = seguinteFuncionario;
        return this;
    }
}
