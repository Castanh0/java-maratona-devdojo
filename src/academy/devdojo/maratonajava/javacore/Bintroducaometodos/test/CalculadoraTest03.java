package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculador;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculador calculador = new Calculador();

        double result = calculador.metodoComRetorno(20,2);
        System.out.println(result);
        System.out.println(calculador.retornoDoisNumeros(10,20));
        calculador.retonoComVoid(12, 3);
    }
}
