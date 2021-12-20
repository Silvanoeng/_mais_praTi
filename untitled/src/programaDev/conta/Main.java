package programaDev.conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new PessoaFisica("Guilherme");
        Conta conta2 = new PessoaFisica("Silvano");
        Conta conta3 = new PessoaFisica("Isadora");
        Conta conta4 = new PessoaFisica("Marina");
        Conta conta5 = new PessoaFisica("Maria");
        conta1.saca(BigDecimal.ZERO);

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);




        Banco b2 = new Banco("Big Digi", contas );
        BigDecimal valorLiberado = b2.liberaEmprestimo( conta5, new BigDecimal(1000));

        System.out.println("Valor liberado %s para %s".formatted(valorLiberado, conta5));

        b2.realizaTransferencia(conta1, conta2, new BigDecimal(750));
        b2.audita();
    }

}
