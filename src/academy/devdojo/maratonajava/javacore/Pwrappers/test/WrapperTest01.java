package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        // tipo primitivo
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5F;
        double doubleP = 6D;
        char charP = 'W';
        boolean booleanP = false;

        // Wrapper OBJ
        // relacionados com polimorfismo
        // passagem de parametros por referencia
        // não passando mais por valores
        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3;  // autoboxing
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("1");


        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


        // autoboxing é quando tem o tipo primitivo e faz a conversão para o Wrapper(OBJ)
        // unboxing é quando vai do Wrapper para um tipo primitivo
        // toda obj tem um metodo
    }
}
