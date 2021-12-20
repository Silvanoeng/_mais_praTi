package programaDev.conta;

import java.math.BigDecimal;

public class PessoaFisica extends Conta{
    public static final String TIPO_DE_DOCUMENTO = "CPF";

    public PessoaFisica(String nome) {
        super(nome);
        this.nome= nome;
        this.documento = TIPO_DE_DOCUMENTO;
    }

    @Override
    public BigDecimal saca(BigDecimal quantidade) {
        System.out.println("APLICANDO REGRA MUITO ESPECÍFICA SEM CHAMAR A SUPER CLASSE");
        System.out.println("SAQUE PARA PESSOA " + this.nome + " COM DOCUMENTO " +  this.documento);
        this.saldo=this.saldo.subtract(quantidade);
        return quantidade;
    }

    @Override
    public BigDecimal deposita(BigDecimal quantidade) {
        System.out.println("APLICANDO REGRA MUITO ESPECÍFICA SEM CHAMAR A SUPER CLASSE");
        System.out.println("DEPOSITANDO PARA PESSOA " + this.nome + " COM DOCUMENTO " +  this.documento);
        this.saldo=this.saldo.add(quantidade);
        return quantidade;
    }
}
