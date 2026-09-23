package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 100000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdade = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Goku";

        System.out.println("A idade é: " + age + " anos");
        System.out.println(verdade);
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println(age);
        System.out.println(salarioFloat);
        System.out.println("Oi, meu nome é " + nome);
    }
}
