package academy.devdojo.maratonajava.introducao.exercicio;

public class Arrays04 {
    public static void main(String[] args) {
        int[] valores = {-3, 9, 12, -34, -2, 20, 10};

        int somaPos = 0;
        int quantidadeNeg = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] < 0){
                quantidadeNeg++;
            } else {
                somaPos += valores[i];
            }
        }

        System.out.println("Soma: " + somaPos);
        System.out.println("Quantidade: " + quantidadeNeg);

    }
}
