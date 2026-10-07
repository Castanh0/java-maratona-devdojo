package academy.devdojo.maratonajava.javacore.Oexececao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
        lerArquivo2();
    }


    // codigo para fechar o tratamento sem o try-with-resources
    public static void lerArquivo() {

//        Reader reader = new null;
//
//        try{
//            reader = new BufferedReader(new FileReader("teste.txt"));
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                if(reader != null){
//                    reader.close();
//                }
//            }catch (IOException exception){
//                exception.printStackTrace();
//            }
//        }
//    }

    }
    // codigo fechando automaticamente com try-with-resources AUTOCLOSEABLE e CLOSEABLE
    // veio para melhorar a legitibilidade do codigo
    // tirando o cargo de fechar toda hora
    public static void lerArquivo2(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}