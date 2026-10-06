package academy.devdojo.maratonajava.javacore.Oexececao.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        // bloco finally sempre será executado, independente de qualquer coisa
        abreConexao();
        abreConexao2();
    }


    private static String abreConexao(){

        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o recurso gerado pelo sistema operacional");
        }
        return null;
    }

    private static void abreConexao2(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando o recurso gerado pelo sistema operacional");
        }
    }
}
