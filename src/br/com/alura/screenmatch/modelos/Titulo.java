package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecão.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double notasSomadas;
    private double mediaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double notaPessoal;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public double getNotaPessoal() {
        return notaPessoal;
    }

    public void setNotaPessoal(double notaPessoal) {
        this.notaPessoal = notaPessoal;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes += totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFicha(){
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        if(getMediaAvaliacao() != 0.0) {
            System.out.println("Media das notas: " + getMediaAvaliacao());
        }
        if(getTotalDeAvaliacoes() != 0) {
            System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        }
    }

    public void somaNotas(double notas){
        this.notasSomadas += notas;
        setTotalDeAvaliacoes(1);
        mediaNotas(this.notasSomadas);
    }

    public void mediaNotas(double nota){
        this.mediaAvaliacao = nota /3;
    }

    @Override
    public String toString() {
        return "(nome = " + nome + ", anoDeLancamento = " + anoDeLancamento + ", duração = " + duracaoEmMinutos + ") ";
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }
}
