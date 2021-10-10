package curso.maisPraTi;

import java.util.Set;

public class SorteioAluno {
    public static void main(String[] args) {
        Set<Aluno> dados = SimularBancoDados.selectAlunos();

        Aluno sorteado = new Aluno("Ana");

        if (dados.contains(sorteado)) {
            System.out.println("Parabéns " + sorteado.getNome() + ", você ganhou!!!");
        }
        else {
            System.out.println("Não foi dessa vez.");
        }
    }
}
