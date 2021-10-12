package revisao_heranca;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario01 = new FuncionarioComum("Silvano", "00101110011", 3000.00);

        Funcionario funcionario02 = new Gerente();
        funcionario02.setNome("Matheus");
        funcionario02.setCpf("00202220022");
        funcionario02.setSalario(4500.00);
        System.out.println(funcionario01.getNome());
        System.out.println(funcionario01.getBonificacao());
        System.out.println(funcionario02.getNome());
        System.out.println(funcionario02.getBonificacao());

    }
}
