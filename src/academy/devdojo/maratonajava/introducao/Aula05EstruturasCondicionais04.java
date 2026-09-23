package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.35 / 100;
        double terceiraTaxa = 49.50 / 100;
        double imposto;

        if (salarioAnual <= 34712) {
            imposto = salarioAnual * primeiraTaxa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = salarioAnual * segundaTaxa;
        } else {
            imposto = salarioAnual * terceiraTaxa;
        }

        System.out.println(imposto);
    }
}

