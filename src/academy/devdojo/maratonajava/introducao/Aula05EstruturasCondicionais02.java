package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 catergoria juvenil
        // idade >= 18 categoria adulto
        int idade = 40;
        String categoria;
        boolean isJuvevil = idade >= 15 && idade < 18;
        boolean isAdulto = idade >=18;

        if (isAdulto) {
            categoria = "Adulto";
        } else if (isJuvevil) {
            categoria = "Juvevil";
        } else {
            categoria = "Infantil";
        }
        System.out.println(categoria);
    }
}
