package revisao_heranca;

public class Cliente {
    private String nome;
    private String sobrenome;
    private int idade;

    public Cliente(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome.equals(null) || sobrenome.equals("")) {
            System.out.println("Esse valor não é valido.");
            return;
        }
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade<16) {
            System.out.println("Deve ter mais de 16 anos.");
            return;
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome='" + this.nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade;
    }
}
