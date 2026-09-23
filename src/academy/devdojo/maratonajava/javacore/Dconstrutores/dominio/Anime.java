package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
        private String nome;
        private String tipo;
        private int episodios;
        private String genero;
        private int anoDeLancamento;

        // construtor principal
        public Anime(String nome, String tipo, int episodios, String genero) {
            // é cham o void do construtor anime sout
            this();
            this.nome = nome;
            this.tipo = tipo;
            this.episodios = episodios;
            this.genero = genero;
        }

        // sobrecarga de construtor secundario
        public Anime() {
            System.out.println("Sem Argumentos");
        }

        public Anime(String nome, String tipo, int episodios, String genero,  int anoDeLancamento) {
            // 1 this , pega o as infos do outro construtor e colocar tbm a do atual
            this(nome, tipo, episodios, genero);
            this.nome = nome;
            this.tipo = tipo;
            this.episodios = episodios;
            this.genero = genero;
            this.anoDeLancamento = anoDeLancamento;
        }

        public void init(String nome, String tipo, int episodios) {
            this.nome = nome;
            this.tipo = tipo;
            this.episodios = episodios;
        }

        // aqui vai passar as infos do primeiro init e mais o genero do novo
        public void init(String nome, String tipo, int episodios, String genero) {
            this.init(nome, tipo, episodios);
            this.genero = genero;
        }

        public void imprimir() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Episodios: " + this.episodios);
            System.out.println("Genero: " + this.genero);
        }


        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setEpisodios(int episodios) {
            this.episodios = episodios;
        }

        public String getTipo() {
            return tipo;
        }

        public int getEpisodios() {
            return episodios;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getGenero() {
            return genero;
        }

        public  void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }
}

