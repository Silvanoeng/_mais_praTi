package revisao_heranca;

public class FuncionarioComum extends Funcionario  {

    public FuncionarioComum() {
    }

    public FuncionarioComum(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }
    @Override
    public double getBonificacao() {
        return getSalario()*0.1;
    }
}
