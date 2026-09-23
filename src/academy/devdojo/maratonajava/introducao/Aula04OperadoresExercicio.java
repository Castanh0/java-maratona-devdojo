package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresExercicio {
    // Aritimerica
    public static void main(String[] args){
        int a = 15;
        int b = 4;

        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int resto = a % b;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(resto);

        // Incremento
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(--x);

//        int y = 10;
//        int resultado = y++ + --y;
//        System.out.println(resultado);

        // Operador Relacional
//        int idade = 18;
//        boolean isMaiorDeIDade = idade >= 18;
//        boolean isMenorQueVinte1 = idade > 21;
//        boolean isTemDezoito = idade == 18;
//        System.out.println(isMaiorDeIDade);
//        System.out.println(isMenorQueVinte1);
//        System.out.println(isTemDezoito);

        // Comparação com Double
        double valor1 = 0.1;
        double valor2 = 0.2;

        System.out.println(valor1 + valor2 == 0.3);

        // Operadores Lógicos
        int idade = 7;
        boolean temCarteira = true;
        if (idade >= 18 && temCarteira == true) {
            System.out.println("Carteira");
        } else {
            System.out.println("Sem Carteira");
        }

        // Curto Circuito
        int x = 5;
        boolean resultado = (x > 10) && (++x > 5);
        System.out.println(x);
    }

}
