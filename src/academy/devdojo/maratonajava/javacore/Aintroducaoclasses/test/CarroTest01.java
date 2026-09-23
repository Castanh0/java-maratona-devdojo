package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        // objetos
        Carro carro01 =  new Carro();
        Carro carro02 =  new Carro();

        // inicializa os valores do objeto
        carro01.nome = "Fusion";
        carro01.modelo = "Ford";
        carro01.ano = 2010;

        carro02.nome = "J6";
        carro02.modelo = "JAC";
        carro02.ano = 2014;


        // Polimorfismos : rules
        carro02 = carro01;

        // imprime os valores dos objetos
        System.out.println(carro01.nome + " " +  carro01.modelo + " " + carro01.ano);
        System.out.println(carro02.nome + " " +  carro02.modelo + " " + carro02.ano);
    }
}
