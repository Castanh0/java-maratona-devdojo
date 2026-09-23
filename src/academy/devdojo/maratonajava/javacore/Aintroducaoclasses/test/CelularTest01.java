package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Celular;

public class CelularTest01 {
    public static void main(String[] args) {
        Celular celular01 = new Celular();
        Celular celular02 = new Celular();

        celular01.marca = "Samsung";
        celular01.modelo = "Galaxy A12";
        celular01.ano = 2018;

        celular02.marca = "Apple";
        celular02.modelo = "Iphone 18";
        celular02.ano = 2026;

        System.out.println(celular01.modelo);
        System.out.println(celular01.marca);
        System.out.println(celular01.ano);

        System.out.print("\n");

        System.out.println(celular02.modelo);
        System.out.println(celular02.marca);
        System.out.println(celular02.ano);

    }
}
