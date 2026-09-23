package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public final class Carro {
    private String nome;
    public static final double VELOCIDADE_MAXIMA = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
