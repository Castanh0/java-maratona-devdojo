package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculador;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculador calculador = new Calculador();

        // parametro vira um ARGUMENTO
        calculador.multiplicarDoisNumeros(10, 20);
    }
}
