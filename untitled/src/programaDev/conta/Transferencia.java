package programaDev.conta;

import java.math.BigDecimal;

public interface Transferencia {
    void realizaTransferencia(Conta origem, Conta destino, BigDecimal valor);
}
