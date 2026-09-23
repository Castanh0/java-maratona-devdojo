package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays15 {
    public static void main(String[] args){

        int[] a = {5, 2, 9, 5, 7};
        int[] b = {2, 6, 10, 3, 3};
        int[] c = new int[5];

        // valor do C
        for(int i = 0; i < a.length; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("\n Valor de A");
        for(int i = 0; i < a.length; i++){
            System.out.println("Valores na matriz a: " + a[i] + " ");
        }

        System.out.println("\n Valor de B: ");
        for (int i = 0; i < b.length; i++){
            System.out.println("Valores na matriz b: " + b[i] + " ");
        }

        System.out.println("\n Valor de C");
        for (int i = 0; i < c.length; i++){
            System.out.println("Valores na matriz c: " + c[i] + " ");
        }
    }
}
