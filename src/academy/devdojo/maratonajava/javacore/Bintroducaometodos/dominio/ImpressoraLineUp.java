package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraLineUp {
    public void imprimirLine(LineUp banda){
        System.out.println("\n--- Lineup ---");
        System.out.println(banda.nome);
        System.out.println(banda.anoBanda);
        System.out.println(banda.integrantes);
    }
}
