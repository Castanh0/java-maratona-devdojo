package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.ArrayList;

public class ProfessorDesafio {
    private String nome;
    private String especialidade;
    private ArrayList<SeminarioDesafio> seminarios;

    public ProfessorDesafio(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = new ArrayList<>();
    }

    public void exibirInfosDoProfessor(){
        System.out.println("Nome do Professor: " + this.nome);
        System.out.println("Especialidade do Professor: " + this.especialidade);
        System.out.println("Seminarios do Professor: ");
        for(SeminarioDesafio seminario: this.seminarios){
            System.out.println(" - " + seminario.getTitulo());
        }
    }

    public void adicionarSeminario(SeminarioDesafio seminario){
        this.seminarios.add(seminario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<SeminarioDesafio> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(ArrayList<SeminarioDesafio> seminarios) {
        this.seminarios = seminarios;
    }
}
