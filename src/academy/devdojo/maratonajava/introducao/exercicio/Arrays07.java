package academy.devdojo.maratonajava.introducao.exercicio;

public class Arrays07 {
    public static void main(String[] args) {
        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 11);
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

        System.out.println();
    }
}
