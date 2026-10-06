package academy.devdojo.maratonajava.javacore.Oexececao.runtime.test;

// https status

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }

    }



}
