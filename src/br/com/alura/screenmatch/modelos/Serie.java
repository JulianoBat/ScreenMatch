package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int epsodiosPorTemporada;
    private boolean aitva;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean isAitva() {
        return aitva;
    }

    public void setAitva(boolean aitva) {
        this.aitva = aitva;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série " + getNome() + " (" + getAnoDeLancamento() + ")";
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporada * minutosPorEpisodio;
    }
}
