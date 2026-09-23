package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media;
        int soma = 0;
        int quantidade = 0;

        int[] valores = new int[10];

        for(int i = 0; i < valores.length; i++){
            System.out.println("Digite um numero: " + (i + 1));
            valores[i] = input.nextInt();
            soma += valores[i];
        }

        media = (soma / valores.length);

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > media){
                quantidade++;
            }
        }


        System.out.println("Media é: "  + media);
        System.out.println("Quantidade de valores acima da média: " + quantidade);
    }
}
