package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {

    public static void main(String[] args) {
        double valorTotal = 3000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
