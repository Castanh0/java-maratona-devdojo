package academy.devdojo.maratonajava.javacore.Oexececao.runtime.test;

// https status

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {


        // multi catch em linha
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }


        try{
            talvezLanceException();
        }catch (SQLException | FileNotFoundException throwables){
            throwables.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }



}
