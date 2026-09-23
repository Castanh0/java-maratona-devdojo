package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Skatista;

public class SkatistaTest01 {
    public static void main(String[] args) {
        Skatista skatista01 = new Skatista();
        Skatista skatista02 = new Skatista();

        // infos de cada participante
        skatista01.nome = "Dora Varella";
        skatista01.idade = 24;
        skatista01.sexo = "F";
        skatista01.liga = "STU";

        skatista02.nome = "Pedro Barros";
        skatista02.idade = 35;
        skatista02.sexo = "M";
        skatista02.liga = "STU e WORLD SKATE";

        // resultados com o this
        skatista01.imprime();
        skatista02.imprime();
    }
}
