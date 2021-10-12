package revisao_heranca;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;



    public Funcionario(){};

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;;
    }

    public double getBonificacao() {
        return getSalario();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.equals(null) || nome.equals("")) {
            System.out.println("Esse valor não é valido.");
            return;
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.equals(null) || cpf.equals("")) {
            System.out.println("Esse valor não é valido.");
            return;
        }
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario<0) {
            System.out.println("Esse valor não é valido.");
            return;
        }
        this.salario = salario;
    }

}
