package academy.devdojo.maratonajava.javacore.Rdates.test;
import java.util.Calendar;
import java.util.Date;

// antigo
// java.util.Date
// java.util.Calendar;
// Date e Calendar = são muito utilizados em sistemas legados
// - sistemas legado: são softwares/infraestruras antigas, e que só são utilizados metodos e classes mais antigas

// novo
// java.util.Time
// Time: utilizado em sistemas mais novos!!!


// - ele manipula a data, tempo, dia, mes, ano, etc...
// - é uma classe abstrata, ou seja, não pode usar o new (criar um obj)
// para utilizar ela, tem que usar o getInstance()
// - ele utiliza um formato default como calendario de diversos tipos no mundo inteiro


// é possivel fazer uma conversão da classe Date para a classe Calendar

public class CalendarTest01 {

    public static void main(String[]args){

        Calendar calendario = Calendar.getInstance();
        // getFirstDayOfWeek: pega o primeiro dia da semana,é sempre domingo
        // ele retorna um inteiro
        if(calendario.getFirstDayOfWeek() ==  Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana");
        };

        // pegar os valores do calendario é com o get()
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));


        // existe o add e o roll

        // o add: pode virar o dia, mes, ano.
        // se vc colocar um numero muito maior
        // adicionar 2 dias
        calendario.add(Calendar.DAY_OF_MONTH, 2);
        // adicionar 3 horas
        calendario.add(Calendar.HOUR_OF_DAY, 3);

        // o roll: caso passe o valor, ele volta a contador no mesmo dia
        // ele vira no msm dia, mes, ano e começa a contar
        calendario.roll(Calendar.HOUR_OF_DAY, 12);

        // o date: formata a classe calender
        Date time = calendario.getTime();
        System.out.println(time);

    }
}
