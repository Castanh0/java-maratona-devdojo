package academy.devdojo.maratonajava.introducao.exercicio;

public class Arrays05 {
    public static void main(String[] args) {
        int[] valores = {6 , 9, 12, 34, 83, 20, 17};

        System.out.println("Ordem original:\n ");
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " ");
        }

        System.out.println("\n\nOrdem invera: \n");
        for(int i = valores.length - 1; i >= 0; i-- ){
            System.out.print(valores[i] + " ");
        }
    }
}
