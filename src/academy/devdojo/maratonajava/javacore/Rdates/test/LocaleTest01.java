package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // tem duas ISO = "pt" e "BR"
        // pt = ISO = 639-1
        // BR = ISO =
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);


        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("India: " + df4.format(calendar.getTime()));
        System.out.println("India: " + df5.format(calendar.getTime()));

        // o getDisplayCountry = tira a versão de siglas e outras coisas
        // para o NOME DO PAIS
        System.out.println(localeItaly.getDisplayCountry());
        // o getDisplayLanguage = transforma um idiomap para o outro
        System.out.println(localeCH.getDisplayLanguage());


        // Metodo / conceito
        // getLanguage():	Código do idioma
        // getCountry():	Código do país
        // getDisplayLanguage():	Nome do idioma
        // getDisplayCountry():	Nome do país
        // getDisplayName():	Nome completo da localização
        // getDefault():	Localização padrão
        // equals():	Comparação entre localidades
        // toString():	Representação textual do Locale


    }
}
