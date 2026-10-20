package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;
// ela tá totalmente depreciada
// hoje em dia ninguem usa o date em sistemas modernos
// ela trabalha como long
// Date trabalha em milisegundos para mostrar o hora e data
public class DateTest02 {
    public static void main(String[] args) {
        Date data = new Date(1792523466287L); // long 100000
        data.setTime(data.getTime() + 3_600_000);

        // ele usa junto o toString para converter objeto para uma String
        System.out.println(data);
    }
}
