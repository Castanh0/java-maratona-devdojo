package academy.devdojo.maratonajava.introducao.exercicio;

public class Arrays03 {
    public static void main(String[] args) {
        int[] valores = {4, 5 , 1, 8, 2, 2, 10};

        int soma = 0;

        for(int i = 0; i < valores.length; i++){
            soma += valores[i];
        }

        System.out.println("Soma: " + soma);
    }
}
