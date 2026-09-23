package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void mostrarDados(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
