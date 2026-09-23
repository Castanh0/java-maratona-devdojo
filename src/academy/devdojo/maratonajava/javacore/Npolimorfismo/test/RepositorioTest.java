package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        // se usa o list, pq ai não é preciso ficar mudar a variavel
        // de refencia, só o objeto


        // pode colocar qualquer um dos objetos
        // a referencia não muda
        Repositorio repositorios = new RepositorioBancoDados();
        repositorios.salvar();

        List<String> listasRepositorio = new LinkedList<>();
        listasRepositorio.add("Goku");
        listasRepositorio.add("Vigeta");
        listasRepositorio.add("Bordef");
        System.out.println(listasRepositorio);
    }
}
