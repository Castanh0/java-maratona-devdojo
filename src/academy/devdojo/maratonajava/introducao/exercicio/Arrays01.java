package academy.devdojo.maratonajava.introducao.exercicio;

public class Arrays01 {
    public static void main(String[] args){
        int[] valor;
        valor = new int[10];

        for (int i = 0; i < valor.length; i++) {
            valor[i] = (i + 1);
        }

        for (int i = 0; i < valor.length; i++) {
            System.out.print(valor[i] + " ");
        }

    }
}
