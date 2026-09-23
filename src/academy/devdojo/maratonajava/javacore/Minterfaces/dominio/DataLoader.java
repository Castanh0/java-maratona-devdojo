package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // serve para declarar constantes de valor fixo, que pertence a propria classe
    public static final int MAX_DATA_SIZE = 10;

    // é um metodo public e abstrato junto
    void load();

    // default: promove uma implementação dentro dele e tambem as vezes não precia implementar dentro de outra classe, contratar
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
