package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        calcularSalario();
    }

    public void calcularSalario(){
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media: " + media);
    }

}
