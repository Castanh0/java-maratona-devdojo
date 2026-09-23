package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ContaBancaria;

public class ContaBncariaTest01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Thiago");
        contaBancaria.setNumeroConta(1234);

        contaBancaria.depositar(500);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.depositar(200);
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        contaBancaria.sacar(150);
        System.out.println(contaBancaria.getSaldo());

        contaBancaria.mostrarDados();
    }
}
