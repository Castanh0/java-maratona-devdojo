package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculador {

    // metodos
    // void não tem retorno para quem esta chamando, ele só exibe que a classe tem calculador
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    // retorno e saida - são coisas diferentes

    // public, private, protected - modificadores de acesso
    // void, String, int, double - retorno
    // nome do acesso
    public void subtrairDoisNumeros(){
        System.out.println(10-40);
    }

    // parametro
    public void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double metodoComRetorno(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double retornoDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        } else {
            return num1/num2;
        }
    }

    public double retornoDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void retonoComVoid(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do alteraDoisNumeroos");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int temp : numeros){
            soma += temp;
        }
        System.out.println(soma);
    }

    public void vargs(int... numeros){
        int soma = 0;
        for(int i : numeros){
            soma += i;
        }
        System.out.println(soma);
    }
}
