package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

// é um template, e não algo concreto
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    public abstract void calcularBonus();
}
