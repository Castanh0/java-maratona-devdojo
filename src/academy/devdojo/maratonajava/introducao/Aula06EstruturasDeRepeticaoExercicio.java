package academy.devdojo.maratonajava.introducao;

import java.io.IOException;
import java.util.Scanner;

public class Aula06EstruturasDeRepeticaoExercicio {
    public static void main(String[] args){

        // 1 -

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Celsius em Fahrenheit: ");
//        double celsius = sc.nextDouble();
//        double fahrenheit = (celsius * 1.8) + 32;
//        System.out.println("Fahrenheit: " + fahrenheit);

        // 2 -

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Digite sua idade: ");
//        int idade = input.nextInt();
//
//            if(idade < 18) {
//                System.out.println("Menor de idade");
//            } else if (idade >= 18) {
//                System.out.println("Maior de idade");
//            } else {
//                System.out.println("Não foi possivel constatar");
//            }

//        Scanner ler = new Scanner(System.in);
//        int i, n;
//
//        System.out.printf("Digite um numero: ");
//        n = ler.nextInt();
//
//        System.out.printf("\n --- Resultado --- \n");
//        for(i=0; i<=10; i++){
//            System.out.printf(" | %2d * %d = %2d |  \n", i, n, (i*n));
//        }
//        System.out.printf("\n +-----------------+ \n");


        // calculadora

//        Scanner input =  new Scanner(System.in);
//
//        System.out.println(" --- Calculadora --- ");
//
//        System.out.println("Digite um numero: ");
//        int number1 = input.nextInt();
//
//        System.out.println("Digite um numero outro numero: ");
//        int number2 = input.nextInt();
//
//        System.out.println("o que voce quer? soma, sub, mult, div");
//        String operacao = input.next();

//        int  resultado;
//        switch (operacao){
//            case "soma":
//                System.out.println(number1 + " + " + number2 + " = " +  (number1 + number2));
//                break;
//            case "sub":
//                System.out.println(number1 + " - " + number2 + " = " +  (number1 - number2));
//                break;
//            case "mult":
//                System.out.println(number1 + " * " + number2 + " = " +  (number1 * number2));
//                break;
//            case "div":
//                System.out.println(number1 + " / " + number2 + " = " +  (number1 / number2));
//                break;
//            default:
//                System.out.println("Não foi posssive constatar o que voce queria");
//        }

//        for(int i = 1; i <= 10; i++){
//            System.out.println("Contando: " + i);
//        }

//        int j = 1;
//        while(j <= 10) {
//            System.out.println("Contando: " + j);
//            j++;
//        }

//        int i = 1;
//        do {
//            System.out.println("Contador: " + i);
//            i++;
//        } while(i <= 10);

//        String texto = "Inter é o maior que aquele time";
//
//        int comprimento = texto.length();
//        System.out.println(comprimento);
//
//        String maiusculo = texto.toUpperCase();
//        System.out.println(maiusculo);
//        String minusculo = texto.toLowerCase();
//        System.out.println(minusculo);
//
//        boolean contem = texto.contains("Inter");
//        System.out.println(contem);
//
//        String substituto = texto.replace("time", "bosta");
//        System.out.println(substituto);

//        String nome1 = "Thiago";
//        String nome2 = "Thaiga";
//
//        if(nome1.equals(nome2)){
//            System.out.println("São iguais");
//        } else {
//            System.out.println("Não são iguais");
//        }

//        String nome1 = "LUAN";
////        String nome2 = "luan";
////
////        if(nome1.equalsIgnoreCase(nome2)){
////            System.out.println("São iguais");
////        } else {
////            System.out.println("Não sço iguais");
////        }

//        String nome = "Carlos";
//        String nome2 = "Carla";
//        String nome3 = "Carlos";
//
//        System.out.println("Nome1 compareTo: " + nome.compareTo(nome2));
//        System.out.println("Nome2 compareTo: " + nome2.compareTo(nome));
//        System.out.println("Nome3 compareTo: " + nome3.compareTo(nome));

//        String texto = "A API de Strings é uma das mais utilizadas na linguagem Java";
//        String linguagem = texto.substring(texto.indexOf("Java"), texto.length());
//
//        if (linguagem.compareToIgnoreCase("java") == 0) {
//            System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é " + linguagem);
//        }
//
//        if(linguagem.compareTo("java") == 0) {
//            System.out.println("compareTo: Encontrei a linguagem! Ela é " + linguagem);
//        }


//        double num = 50.30;
//        double arredondado = Math.round(num);
//        double paraCima = Math.ceil(num);
//        double paraBaixo = Math.floor(num);
//        double raizQuadrada = Math.sqrt(num);
//
//
//        System.out.println(arredondado);
//        System.out.println(paraCima);
//        System.out.println(paraBaixo);
//        System.out.println(raizQuadrada);


        int [] vetor = new int[10];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        vetor[5] = 6;
        vetor[6] = 7;
        vetor[7] = 8;
        vetor[8] = 9;
        vetor[9] = 10;

//        int soma = 0;
//        System.out.println("Elementos do Array: ");
//        for (int i=0; i<vetor.length; i++){
//            soma += vetor[i];
//            System.out.println(vetor[i]);
//        }

//        System.out.println(soma);

//        int[] number = {10, 123, 43, 30, 54, 1, 2,34};
//        int maior = number[0];
//
//        for(int i = 1; i <number.length; i++){
//            if (number[i] > maior){
//                maior = number[i];
//            }
//        }
//
//        System.out.println("Maior valor: " + maior);

        // Exercicio 7 - Adicione um elemento ao Array

        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                soma  += matriz[i][j];

                System.out.println(matriz[i][j] + " e a soma é de: " + soma);
            }
        }






    }
}