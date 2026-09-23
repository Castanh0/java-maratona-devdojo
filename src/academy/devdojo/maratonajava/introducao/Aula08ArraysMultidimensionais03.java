package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[] arrayDentro = {1, 2, 3, 4, 5, 6};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = arrayDentro;


        for (int[] num : arrayInt) {
            for(int num2 : num){
                System.out.println(num2 + " ");
            }
        }
    }
}
