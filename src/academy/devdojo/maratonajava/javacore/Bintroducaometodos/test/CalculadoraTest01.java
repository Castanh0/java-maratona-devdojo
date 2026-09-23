package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculador;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculador calculador = new Calculador();

        // existe diferença em um objeto classificado em um atributo e um metodo
        calculador.somaDoisNumeros();

        calculador.subtrairDoisNumeros();


    }
}
