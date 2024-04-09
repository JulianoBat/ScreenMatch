import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastre um novo filme: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Ano de lançamento: ");
        int anoDeLancamento = scan.nextInt();

        Filme filme = new Filme(nome, anoDeLancamento);

        System.out.println("Dê 3 notas para este filme: ");
        for (int i = 1; i < 4; i++) {
            System.out.println(i + "a nota: ");
            double nota = scan.nextDouble();
            filme.somaNotas(nota);
        }

        System.out.println("precione 1 para exibir o resultado ou 0 para sair: ");
        int sn = scan.nextInt();
        if(sn == 1){
            filme.exibeFicha();
        } else {
            System.out.println("Não exibido!");
        }

    }

}