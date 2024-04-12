package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {
        Serie lost = new Serie("Lost", 2000);
        Filme filme1 = new Filme("Avatar", 2009);
        filme1.setNotaPessoal(9);
        Filme filme2 = new Filme("Avatar 2", 2022);
        filme2.setNotaPessoal(6);
        Filme filme3 = new Filme("Dogville", 2003);
        filme3.setNotaPessoal(10);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item);
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaArtista = new LinkedList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Paulo");
        buscaArtista.add("Jacqueline");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Ordenado" + buscaArtista);
//
//        Collections.sort(lista);
//        System.out.println("Lista de titulos ordenado por nome: " + lista );

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de titulos ordenado por ano de lançamento: " + lista );

        lista.sort(Comparator.comparing(Titulo::getNome));
        System.out.println("Lista de titulos ordenado por nome: " + lista );

    }
}
