package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays11 {
    public static void main(String[] args){
        int[] valores = {4, 21 ,8, 120, 1};

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor a ser encontrado: ");
        int valor = input.nextInt();

        int pos = -1;
        for(int i = 0; i < valores.length; i++){
            if(valores[i] == valor){
                pos = i;
                break;
            }
        }

        if(pos > -1){
            System.out.println("O Valor foi encontrado:" +  valores[pos]);
        } else {
            System.out.println("Valor não encontrado");
        }


    }
}
