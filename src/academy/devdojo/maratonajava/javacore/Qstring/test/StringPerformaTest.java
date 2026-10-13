package academy.devdojo.maratonajava.javacore.Qstring.test;
// trabalhando com micro desempenho
// String normal é muito lento para ler;
// String builder é muito rapido para ler, isso é, muito melhor. precisa de append;
// Quando se trabalha com multiplas threads ao mesmo tempo, existe uma Classe muito boa para isso
// String buffer

// string normal é usado no dia a dia como nome, tipo de conta, etc...

public class StringPerformaTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        concatString(100_000);

        // conforme o aumento de strings o o sistema vai pesando,
        // então, isso é indispensavel nesse requisito. para descobrir o desempenho sistema

        // o method currentTimeMillies -> pega o tempo decorrido em uma execução e joga no terminal
        // transforma o horario do computador em ms
        long fim = System.currentTimeMillis();

        long iniciobuilder = System.currentTimeMillis();

        concatStringBuilder(100_000);
        long fimbuilder = System.currentTimeMillis();

        System.out.println("Tempo gasto da string" + (fim - inicio) + " ms");
        System.out.println("Tempo gasto da stringBuilder: " + (fimbuilder - iniciobuilder) + " ms");
    }

    private static void concatString(int tamanho){
        String texto = " ";
        for (int i = 0; i < tamanho; i++){ // as strings são imutaveis
            texto += i;                   // então vai ser 0, 01, 012, 0123, 01234
        }
    }

    // não é sincronizado -> não pode atuar com mult thread
    private static void concatStringBuilder(int tamanho){
        // ele cria e modifica sequencia de texto de forma mutavel
        // ele tem o passagem livre para quebrar a barreira da imatabilidade da string no java
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){ // as strings são imutaveis
            // stringbuilder é um com append para ir adicionando
            sb.append(i);                 // então vai ser 0, 01, 012, 0123, 01234
        }
    }

    // um é sincronizado -> pode atuar com mult thread
    private static void concatStringBuffer(int tamanho){
        // ele cria e modifica sequencia de texto de forma mutavel
        // ele tem o passagem livre para quebrar a barreira da imatabilidade da string no java
        StringBuffer sbuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){ // as strings são imutaveis
            // stringbuilder é um com append para ir adicionando
            sbuffer.append(i);                 // então vai ser 0, 01, 012, 0123, 01234
        }
    }
}
