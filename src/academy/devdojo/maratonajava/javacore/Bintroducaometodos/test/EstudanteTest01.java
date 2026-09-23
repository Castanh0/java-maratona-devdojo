package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Pedro";
        estudante01.sexo = 'M';
        estudante01.idade = 10;
        estudante01.anoTurma = 9;

        estudante02.nome = "Guiza";
        estudante02.sexo = 'F';
        estudante02.idade = 10;
        estudante02.anoTurma = 4;


        // imprimir as coisas com this
        estudante01.imprimir();
        estudante02.imprimir();


    }
}
