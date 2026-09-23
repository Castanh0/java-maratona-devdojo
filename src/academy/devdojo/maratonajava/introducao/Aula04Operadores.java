package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        // Aritimeticos +, -, /, *
        int numero1 = 20;
        int numero2 = 12;
        int multiplicacao = numero1 * numero2;
        System.out.println(multiplicacao);

        // Relacionais resto( % )
        int resto = 20 % 2;
        int resto2 = 20 % 7;
        System.out.println(resto);
        System.out.println(resto2);

        // Lógico < >, <= >=, ==, !=  (valor sempre booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte" + isDezIgualQueVinte);

        // Lógico AND ( && ), OR ( || ), NOT ( ! )
        // AND &&
        int age = 29;
        float cash = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && cash >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && cash >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        // OR ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // Atribuição =, +=, -=, /=, %=
        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -=1000; // 1800
        System.out.println(bonus);

        // Incrementação ++, --
        /*      Operação      Nome               Descrição        ++i      Pré-incremento        Incrementa, depois usa.        i++      Pós-incremento        Usa, depois incrementa.        i--      Pós-decremento        Usa, depois diminui 1.        --i      Pré-decremento        Diminui 1, depois usa.
         */
        int contador = 0;
        contador++; // forma abreviada de contador += 1 ou contador = contador + 1
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------");
    }
}
