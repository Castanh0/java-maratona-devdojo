package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AlunoDesafio;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorDesafio;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.SeminarioDesafio;

public class SeminarioTest {
    public static void main(String[] args) {

        // Local
        Local local = new Local("Rua das Flores, 150");

        // Professor
        ProfessorDesafio professor = new ProfessorDesafio(
                "William Suane",
                "Java"
        );

        // Seminário
        SeminarioDesafio seminario = new SeminarioDesafio(
                "POO com Java",
                professor,
                local
        );

        // Professor ministra esse seminário
        professor.adicionarSeminario(seminario);

        // Alunos
        AlunoDesafio aluno1 = new AlunoDesafio(
                "Thiago",
                19,
                seminario
        );

        AlunoDesafio aluno2 = new AlunoDesafio(
                "Maria",
                20,
                seminario
        );

        AlunoDesafio aluno3 = new AlunoDesafio(
                "João",
                22,
                seminario
        );

        // Matriculando os alunos
        seminario.adicionarAluno(aluno1);
        seminario.adicionarAluno(aluno2);
        seminario.adicionarAluno(aluno3);

        System.out.println("=================================");
        seminario.exibirInfosDoSeminario();
        System.out.println("=================================");
    }
}