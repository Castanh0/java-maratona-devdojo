package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Estruturas condicionais - ternario
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro Dev Dojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        // (condição) ? verdadeiro : falso
        String mensagemResultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(mensagemResultado);

    }
}

