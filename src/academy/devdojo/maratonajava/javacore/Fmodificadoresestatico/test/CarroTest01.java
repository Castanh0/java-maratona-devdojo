package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Porsche", 300);
        Carro carro3 = new Carro("Ferrari", 290);

        Carro.setVelocidadelimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
