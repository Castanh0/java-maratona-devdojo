package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "Maria";
        professor1.sexo = 'F';
        professor1.idade = 40;
        professor1.curso = "Historia";

        System.out.println(professor1.nome + " " +  professor1.sexo + " " + professor1.idade + " " +  professor1.curso);
    }
}
