package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("\n--- Digite os Valores ---");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor " + (i + 1) + ": ");
            valores[i] = input.nextInt();
        }

        System.out.println("\n--- Valores armazenados ---");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

        int maior = valores[0], menor = valores[0];
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        System.out.println("\n--- Valores ---");
        System.out.print("Menor valor informado: " + menor);
        System.out.print("Maior valor informado: " + maior);
    }
}
