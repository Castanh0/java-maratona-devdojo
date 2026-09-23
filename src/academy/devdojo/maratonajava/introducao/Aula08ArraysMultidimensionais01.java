package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6 Meses
        // 31, 28, 31, 30 dias

        String[][] dias = new String[3][3];
        dias[0][0] = "1MA";
        dias[0][1] = "1MB";
        dias[0][2] = "1MC";

        dias[1][0] = "2MA";
        dias[1][1] = "2MB";
        dias[1][2] = "2MC";

        dias[2][0] = "3MA";
        dias[2][1] = "3MB";
        dias[2][2] = "3MC";

        // fazer exercicio disso
        for(int i=0; i<dias.length; i++){
            for(int j=0; j<dias[i].length; j++){
                System.out.print(dias[i][j] + " ");
            }
        }
    }
}
