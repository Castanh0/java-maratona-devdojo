package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // modificador static
    private static double velocidadelimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void imprime(){
        System.out.println("---------------------------");
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadelimite);
    }

    // get e set de metodos static
    // metoddos static
    // se usa o nome da Classe = this
    public static void setVelocidadelimite(double velocidadelimite) {
        Carro.velocidadelimite = velocidadelimite;
    }

    public static double  getVelocidadelimite() {
        return Carro.velocidadelimite;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
