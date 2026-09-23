package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraLineUp;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.LineUp;

public class LineUpTest01 {
    public static void main(String[] args) {
        LineUp banda01 = new LineUp();
        LineUp banda02 = new LineUp();


        banda01.nome = "Anavitoria";
        banda01.anoBanda = 2018;
        banda01.integrantes = "Ana Caetano e Vitoria";

        banda02.nome = "Lagum";
        banda02.anoBanda = 2016;
        banda02.integrantes = "Pedro Calais e Vitor Amaral";

        ImpressoraLineUp banda = new ImpressoraLineUp();
        banda.imprimirLine(banda01);
        banda.imprimirLine(banda02);

    }
}
