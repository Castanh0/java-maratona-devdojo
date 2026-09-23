package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valor = new int[10];

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite um valor: " + (i + 1));
            valor[i] = input.nextInt();
        }

        for (int i = 0; i < valor.length; i++) {
            System.out.println("O " + (i + 1) + " valor foi: " + valor[i]);
        }

    }
}
