package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - alocado espaco em memoria pro objeto
    // 2 - cada atributo de classe é criado e inializado com valores default ou quer for passado
    // 3 - bloco de inicializacao é executado
    // 4 - construtor é executado


    // bloco de inicializacao de instancia
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        System.out.println(episodios);
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
