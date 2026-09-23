package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {

    // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condicao é que o valorParcela >= 1000    // Break
    public static void main(String[] args) {
        double valorTotal = 50000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela: " + parcela + "RS " + valorParcela);
        }
    }
}
