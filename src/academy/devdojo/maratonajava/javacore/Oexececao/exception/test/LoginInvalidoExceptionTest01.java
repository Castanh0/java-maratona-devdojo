package academy.devdojo.maratonajava.javacore.Oexececao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.LoginInvalidaException;

import java.util.Scanner;
import java.util.stream.Stream;

// a exception customizada é MUITO UTILIZADA no dia a dia!!!!!!!!!
// estudar bastante isso

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args){
        try {
            logar();
        }catch (LoginInvalidaException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidaException{
        Scanner sc = new Scanner(System.in);


        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuario");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha");
        String senhaDigitado = sc.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidaException("Usuario ou Senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
