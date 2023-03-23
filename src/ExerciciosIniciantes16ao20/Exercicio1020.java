package ExerciciosIniciantes16ao20;

import java.io.IOException;
import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

apenas para facilitar o cálculo, consideretodo ano com 365 dias etodo mês com 30 dias. Nos casos de teste nunca haverá
uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar
raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

public class Exercicio1020 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();

        int tempoAtual = tempo;

        int ano = tempoAtual / 365;
        tempoAtual -= ano * 365;
        int mes = tempoAtual / 30;
        tempoAtual -= mes * 30;
        int dias = tempoAtual;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
