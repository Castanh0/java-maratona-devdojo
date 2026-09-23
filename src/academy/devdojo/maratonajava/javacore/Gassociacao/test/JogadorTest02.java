package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    // aqui não tem associação nenhuma a jogares
    // associação unidirecional um para muitos
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Maradoowqde");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
