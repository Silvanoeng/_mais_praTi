package programaDev.conta;

import java.math.BigDecimal;

public interface Financiamento {
    boolean pegaEmprestimo(Conta conta);
    BigDecimal liberaEmprestimo(Conta conta, BigDecimal valor);
}
