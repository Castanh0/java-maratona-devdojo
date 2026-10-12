package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    // Strings são imutaveis
    // é preciso tomar muito cuidado em nomear e armazenar as variaveris de refencia de valores de uma string

    public static void main(String[] args) {
        String nome = "William";  // String constant pool
        String nome2 = "William";
        // criou um nova string de refenrencia
        // e tbm tem uma nova string com willim suane
        nome = nome.concat("Suane");
        System.out.println(nome);

        // para comparar a referencia de um obj é utilizada o "=="
        // isso  significa que estas 2 variaveis de referencia, esto linkando o msm valor em memoria
        System.out.println(nome == nome2);

        // a esta fazendo uma referencia a um objeto
        // nisso cria uma memoria em outro lugar
        String nome3 = new String("William");  // 1 - variavel de referencia, 2 - objeto do tipo string, 3 - uma string no pool de string
        System.out.println(nome2 == nome3);
        // ele pega a info dentro do obj da String
        // ele pega a info dentr do pool de string
        System.out.println(nome2 == nome3.intern());

    }
}
