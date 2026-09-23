package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] nota;
    private double media;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double[] getNota() {
        return nota;
    }
    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public  double getMedia() {
        return media;
    }

    public void calcularMedia(){
        double soma = 0;
        for(double n : nota){
            soma += n;
        }
        media = soma / nota.length;
    }

    public boolean aprovado(){
        return  media >= 7;
    }

    public void mostrarInformacao(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Media: " + this.media);

        if(aprovado()){
            System.out.println("Situação: aprovado");
        }else {
            System.out.println("Situação: reprovado");
        }
    }
}
