package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        // if
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Voce é autorizado a comprar bebida");
        } else {
            System.out.println("Voce não é autorizado a comprar bebidassss");
        }
        // ! operador de negação - se não é autorizado
        if (!isAutorizadoComprarBebida) {
            System.out.println("Voce não é autorizado a comprar bebida");
        }
        System.out.println("Fora do if");
    }
}
