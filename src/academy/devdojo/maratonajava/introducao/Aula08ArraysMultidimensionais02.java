package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] value =  new int[3][3];

        value[0][0] = 12;
        value[0][1] = 13;
        value[0][2] = 14;

        value[1][0] = 22;
        value[1][1] = 23;
        value[1][2] = 24;

        value[2][0] = 25;
        value[2][1] = 26;
        value[2][2] = 27;

        for(int[] num : value){
            for(int num2 : num){
                System.out.print(num2 + " ");
            }
        }




    }
}
