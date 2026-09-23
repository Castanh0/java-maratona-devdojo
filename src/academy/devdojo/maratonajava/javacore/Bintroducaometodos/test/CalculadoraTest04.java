package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculador;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        Calculador calculador = new Calculador();

        // numbers alterados - dentro do metodo ele altera
        calculador.alteraDoisNumeros(num1, num2);

        // numbres não alretados
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
