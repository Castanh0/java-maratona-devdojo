package academy.devdojo.maratonajava.javacore.Oexececao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }
    public static void criarNovoArquivo() throws IOException {

        File file = new File("arquivo\\texto.txt");

        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado" + isCreated);
        }catch (IOException e){

            e.printStackTrace();
            throw new RuntimeException("Erro ao criar o arquivo");
        }
    }
}
