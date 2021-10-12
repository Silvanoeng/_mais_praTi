package revisao_heranca;

public class Diretor extends Funcionario  {

    public Diretor() {
    }

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }
    @Override
    public double getBonificacao() {
        return getSalario()*2;
    }
}
