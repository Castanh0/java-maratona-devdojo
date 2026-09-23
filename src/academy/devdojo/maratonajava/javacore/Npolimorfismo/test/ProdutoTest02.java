package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // o new Computador começa a ficar dentro do produto
        // assim o objeto é que executa e faz outras coisas
        Produto produto = new Computador("Ryzen 9", 30000.00);
        System.out.println("Computador: "+produto.getNome()
        +"\nComputador: "+produto.getValor());
    }
}
