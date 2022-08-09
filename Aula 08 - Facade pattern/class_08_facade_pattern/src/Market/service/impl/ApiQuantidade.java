package Market.service.impl;

public class ApiQuantidade {
    /** Method **/
    public int desconto(int quantidade) {
        if (quantidade > 12) {
            return 15;
        } else {
            return 0;
        }
    }
}
