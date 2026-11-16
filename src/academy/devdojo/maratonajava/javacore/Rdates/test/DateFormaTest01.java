package academy.devdojo.maratonajava.javacore.Rdates.test;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.Calendar;

public class DateFormaTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // converte, formata e interpreta datas e horas em formato de string
        // a classe DateFormat - tem alguns metodos já pré-definidos para formatar o dia,mes, ano e hora
        // criando 6 array, porem o dateFormat original é abstrata, sem o new (criando um obj)
        DateFormat[] formatando = new DateFormat[7];
        // foi utilizado o array, pois, ele delimitou só o tamanho do array
        // porem, para colocar as infos dentro utilizando DateFormat é tudo de format abstrata

        // cria um formatador padrao
        formatando[0] = DateFormat.getInstance();

        // cria um formatador que aparece somente a data
        formatando[1] = DateFormat.getDateInstance();

        // cria um formatador que exibe a data e hora completa
        formatando[2] = DateFormat.getDateTimeInstance();

        // estilos de formatacao: short, medium, long and full
        formatando[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        formatando[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        formatando[5] = DateFormat.getDateInstance(DateFormat.LONG);
        formatando[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat dateFormat2 : formatando){
            System.out.println(dateFormat2.format(calendar.getTime()));
        }
    }
}
