package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.ArrayList;

public class SeminarioDesafio {
    private String titulo;
    private ArrayList<AlunoDesafio> alunos;
    private ProfessorDesafio professor;
    private Local enderecoLocal;

    public SeminarioDesafio(String titulo, ProfessorDesafio professor,Local enderecoLocal) {
        this.titulo = titulo;
        this.alunos = new ArrayList<>();
        this.professor = professor;
        this.enderecoLocal = enderecoLocal;
    }

    public void exibirInfosDoSeminario(){
        System.out.println("Titulo: " + this.titulo);
        listarAlunos();
        professor.exibirInfosDoProfessor();
        System.out.println("Endereco: " + this.enderecoLocal.getEndereco());
    }

    public void adicionarAluno(AlunoDesafio aluno){
        this.alunos.add(aluno);
    }

    public void listarAlunos(){
        if (this.alunos.isEmpty()) {
            System.out.println("Não tem nenhum aluno");
            return;
        }

        for(AlunoDesafio aluno: this.alunos){
            aluno.exibirAluno();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<AlunoDesafio> getAluno() {
        return alunos;
    }

    public void setAluno(ArrayList<AlunoDesafio> aluno) {
        this.alunos = aluno;
    }

    public ProfessorDesafio getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorDesafio professor) {
        this.professor = professor;
    }

    public Local getEnderecoLocal() {
        return enderecoLocal;
    }

    public void setEnderecoLocal(Local enderecoLocal) {
        this.enderecoLocal = enderecoLocal;
    }
}
