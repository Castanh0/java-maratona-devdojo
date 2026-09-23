package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class AlunoDesafio {
    private String nome;
    private int idade;
    private SeminarioDesafio seminario;

    public AlunoDesafio(String nome, int idade, SeminarioDesafio seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void exibirAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Seminario: " + this.seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public SeminarioDesafio getSeminario() {
        return seminario;
    }

    public void setSeminario(SeminarioDesafio seminario) {
        this.seminario = seminario;
    }
}
