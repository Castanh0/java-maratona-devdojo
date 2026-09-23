package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC19i7", 11000.0);
        Tomate tomate = new Tomate("Tomate Vermelhinho", 10);
        CalcularImposto.calcularImposto(computador);
        CalcularImposto.calcularImposto(tomate);
    }
}
