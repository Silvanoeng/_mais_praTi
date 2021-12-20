package programaDev.conta;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class Banco implements Financiamento, Transferencia, Auditoria{
    private String nome;
    private List<Conta> constas;

    public Banco(String nome, List<Conta> constas) {
        this.nome = nome;
        this.constas = constas;
    }

    @Override
    public boolean pegaEmprestimo(Conta conta) {
        return new Random().nextBoolean();
    }

    @Override
    public BigDecimal liberaEmprestimo(Conta conta, BigDecimal valor) {
        if (this.pegaEmprestimo(conta)){
            return valor;
        }

        return valor.divide(new BigDecimal(2));
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getConstas() {
        return List.copyOf(constas);
    }

    @Override
    public void realizaTransferencia(Conta origem, Conta destino, BigDecimal valor) {
        BigDecimal valorSacado = origem.saca(valor);
        destino.deposita(valorSacado);
    }

    @Override
    public void audita() {
        Auditoria.super.audita();
        System.out.println("Auditoria customizada.");
    }
}
