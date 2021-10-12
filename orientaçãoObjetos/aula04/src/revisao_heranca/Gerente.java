package revisao_heranca;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }
    @Override
    public double getBonificacao() {
        return getSalario();
    }
}
