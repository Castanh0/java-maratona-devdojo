package academy.devdojo.maratonajava.javacore.Oexececao.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[]args){
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        // a segunda contrabarra é considerada uma barra realmente
        File file = new File("arquivo\\texto.txt");
        // tenta fazer algo
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado" + isCreated);
        }catch (IOException e){
            // trata o erro
            // não pode deixar o bloco catch em branco
            // printStackTrace = está preparado para a exception e só imprime a exception
            // é uma trativa
            e.printStackTrace();
        }
    }
}
