package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    // da pra colocar numero pra identificar as coisas. pode ter string tbm
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    // isso vem dps do "atributo de enum"
    public final int VALOR;
    public final String NOME;

    // aqui ele cria um construtor e temos que dar um value no parametro
    TipoCliente(int valor, String nome) {
        this.VALOR = valor;
        this.NOME = nome;
    }

    public String getNOME() {
        return NOME;
    }

    // só se usa get, pois não queremos alterar nada


    public int getVALOR() {
        return VALOR;
    }
}
