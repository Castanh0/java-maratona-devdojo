package academy.devdojo.maratonajava.javacore.Qstring.test;

// String e StringBuilder/Buffer são coisas completamente diferentes!!!

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William and sons"; // são imutaveis
        nome.concat("Devdojo");
        System.out.println(nome);

        // String builder
        // não tem mais o conceito de String imutavel. pois, ela não é uma String é uma classe que trabalha com Strings
        // tamanha padrão é 16, quando estoura ele dobra o valor 16, 32
        // não se adiciona um valor para uma StringBuilder/Buffer com " ... "
        // se adiciona atraves do .append()
        StringBuilder sb = new StringBuilder("William and sons");
        sb.append("Dev Dojo").append("William asaaaaaaadas");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        // ele evita utilizar memoria do pool de string
    }
}
