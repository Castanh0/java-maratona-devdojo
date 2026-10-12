package academy.devdojo.maratonajava.javacore.Qstring.test;
// principais metodos do string
public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Luffy  ";
        String numeros = "  012345  ";
        // se baseia em indice. 0 = L
        System.out.println(nome.charAt(0));
        // para saber o tamanho, e é um metodo, diferente do usado no array que é um atributo
        System.out.println(nome.length());
        // ele faz a troca de todos os caracteres da primeira posição
        System.out.println(nome.replace("f", "l"));
        // minusculo e maiusculo
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        // recebe 2 valores. 1 - index = inicio and 2 - index = end
        // o final é sempre -1 do valor
        System.out.println(numeros.substring(0,2));
        // ele remove os valores em branco do inicio e fim da string
        // muito usado em login de sistemas
        System.out.println(nome.trim());
    }
}
