import br.com.alura.screenmatch.calculos.CalculadoraDeTempos;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Cadastre um novo filme: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Ano de lançamento: ");
        int anoDeLancamento = scan.nextInt();

        Titulo titulo = new Titulo(nome, anoDeLancamento);

        System.out.println("Dê 3 notas para este filme: ");
        for (int i = 1; i < 4; i++) {
            System.out.println(i + "a nota: ");
            double nota = scan.nextDouble();
            titulo.somaNotas(nota);
        }

        System.out.println("Deseja exibir o resultado? (S/N): ");
        String sn = scan.next();
        if(sn.equals("s") || sn.equals("S")){
            titulo.exibeFicha();
        } else {
            System.out.println("Não exibido!");
        }

*/
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFicha();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        //System.out.println("Tempo em minutos para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme meuFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setDuracaoEmMinutos(161);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(150);

        CalculadoraDeTempos calculadora = new CalculadoraDeTempos();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizações(300);
        filtro.filtra(episodio);

    }

}