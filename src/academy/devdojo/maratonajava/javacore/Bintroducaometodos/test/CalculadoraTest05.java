package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculador;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculador calculadora = new Calculador();

        // aqui precisa criar um array no main
        int[] numbers = {1, 2, 3, 4, 5};
        calculadora.somaArray(numbers);

        // aqui por conta do vargs (ele criar uma coleção em um array)
        calculadora.vargs(1,2,3,4,5,6,7,8,9,10);
    }
}
