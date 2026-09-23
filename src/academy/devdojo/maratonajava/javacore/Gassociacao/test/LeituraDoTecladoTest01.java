package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("Digite M ou F para seu sexo: " );
        char sexo = input.next().charAt(0);
        System.out.println("---------------------------");
        System.out.println("Nome " +  name);
        System.out.println("Idade " +  age);
        System.out.println("Sexo " +  sexo);
    }
}
