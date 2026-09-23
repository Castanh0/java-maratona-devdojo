package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = {4, 21, 9, 8, 12, 21, 4, 4, 1, 10};

        System.out.println("Digite um valor a ser encontrado: ");
        int valor = input.nextInt();

        int quantidade = 0;
        for(int i = 0; i < valores.length; i++) {
            if(valores[i] == valor) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de valores: " + quantidade);

    }
}
