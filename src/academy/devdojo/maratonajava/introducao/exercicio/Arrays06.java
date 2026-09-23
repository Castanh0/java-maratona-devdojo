package academy.devdojo.maratonajava.introducao.exercicio;

public class Arrays06 {
    public static void main(String[] args) {
        int[] valores = {5, 32, 9, 10, 6};

        // vai aceitar porque vai contar de 0 a 4 (0 < 5 = 5 - 1 = 4)
        // se fosse (0 <= 5), não funcionaria. Pq, teria 5 indicies
        // 0, 1, 2, 3, 4, 5 - tendo que ter 6 numeros
        // 0, 1, 2, 3, 4 - tem 5 numeros é o certo!!
        for(int i = 0; i < 5; i++){
            System.out.println(valores[i]);
        }
    }
}
