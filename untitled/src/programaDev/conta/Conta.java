package programaDev.conta;

import java.math.BigDecimal;

public abstract class Conta {
    protected String nome;
    protected String documento;
    protected BigDecimal saldo;

    public Conta(String nome) {
        this.saldo = new BigDecimal(1000);
    }

    public abstract BigDecimal deposita(BigDecimal quantidade);

    public BigDecimal saca(BigDecimal quantidade){
        System.out.println("EXECUTA REGRA DE NEGÓCIO GENERALISTA");
        return BigDecimal.ZERO;
    }

    @Override
    public String toString() {
        return "conta de " +
                nome + ".";
    }


}
