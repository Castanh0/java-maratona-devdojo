package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Skatista {
    public String nome;
    public int idade;
    public String sexo;
    public String liga;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Liga: "+this.liga);
    }
}
