package programaDev.conta;

import java.math.BigDecimal;

public class PessoaJuridica extends Conta{
    public static final String TIPO_DE_DOCUMENTO = "CNPJ";

    public PessoaJuridica(String nome) {
        super(nome);
        this.nome= nome;
        this.documento=TIPO_DE_DOCUMENTO;
    }


    @Override
    public BigDecimal saca(BigDecimal quantidade) {
        System.out.println("APLICANDO REGRA MUITO ESPECÍFICA SEM CHAMAR A SUPER CLASSE");
        System.out.println("SAQUE PARA EMPRESA " + this.nome + " COM DOCUMENTO " +  this.documento);
        return quantidade;
    }

    @Override
    public BigDecimal deposita(BigDecimal quantidade) {
        System.out.println("APLICANDO REGRA MUITO ESPECÍFICA SEM CHAMAR A SUPER CLASSE");
        System.out.println("DEPOSITANDO PARA EMPRESA " + this.nome + " COM DOCUMENTO " +  this.documento);
        return quantidade;
    }
}
