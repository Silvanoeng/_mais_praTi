package curso.maisPraTi;

import java.util.HashSet;
import java.util.Set;

public class SimularBancoDados {

    public static Set<Aluno> selectAlunos() {

        Aluno aluno01 = new Aluno("Maria", 16, "mariasilva@hotmail.com");
        Aluno aluno02 = new Aluno("Paulo", 17, "pauloaraujo@hotmail.com");
        Aluno aluno03 = new Aluno("Matheus", 15, "matheussantos@hotmail.com");
        Aluno aluno04 = new Aluno("Bruno", 16, "brunopereira@hotmail.com");
        Aluno aluno05 = new Aluno("Ana", 17, "analuiza@hotmail.com");

        Set<Aluno> setAluno = new HashSet<Aluno>();
        setAluno.add(aluno01);
        setAluno.add(aluno02);
        setAluno.add(aluno03);
        setAluno.add(aluno04);
        setAluno.add(aluno05);

        return setAluno;
    }
}
