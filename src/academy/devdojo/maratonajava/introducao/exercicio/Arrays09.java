package academy.devdojo.maratonajava.introducao.exercicio;

import java.util.Scanner;

public class Arrays09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = {4, 21, 8, 120, 1};

        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        System.out.println("Digite valores validos: ");
        int valorScanner = input.nextInt();

        boolean encontrado = false;
        for (int i = 0; i<valores.length; i++){
            if (valores[i] == valorScanner){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            System.out.println("O valor digitado foi encontrado");
        } else {
            System.out.println("O valor nã ovoi encontrado");
        }


    }
}
