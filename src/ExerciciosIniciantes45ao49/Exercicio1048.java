package ExerciciosIniciantes45ao49;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice
reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais)
e o percentual de reajuste ganho, conforme exemplo abaixo.
 */

public class Exercicio1048 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        int percentual = 0;
        double reajuste = 0.0;

        if(salario >= 0 && salario <= 400.00) {
            percentual = 15;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else
        if(salario >= 400.01 && salario <= 800.00) {
            percentual = 12;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else
        if(salario >= 800.01 && salario <= 1200.00) {
            percentual = 10;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else
        if(salario >= 1200.01 && salario <= 2000.00) {
            percentual = 7;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else
        if(salario > 2000.00) {
            percentual = 4;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        }


        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        sc.close();
    }
}
