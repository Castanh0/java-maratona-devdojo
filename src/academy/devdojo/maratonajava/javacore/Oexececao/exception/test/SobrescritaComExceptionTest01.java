package academy.devdojo.maratonajava.javacore.Oexececao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.LoginInvalidaException;
import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidaException e) {
            throw new RuntimeException(e);
        }
    }
}
