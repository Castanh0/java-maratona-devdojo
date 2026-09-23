package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("\n--- Digite um valor ---" );
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor: " + (i + 1));
            valores[i] = input.nextInt();
        }

        System.out.println("\n--- Valores informados foram ---");
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " ");
        }

        System.out.println("\n--- Resultados foram de > ou < ---");
        int maior = valores[0], menor = valores[0];
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.print("Valor maior: " + maior);
        System.out.print("Valor menor: " + menor);
    }
}
