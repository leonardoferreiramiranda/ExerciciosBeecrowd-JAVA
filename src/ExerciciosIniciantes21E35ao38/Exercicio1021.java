package ExerciciosIniciantes21E35ao38;

import java.util.Scanner;

public class Exercicio1021 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int cedulas = (int) valor;
        int centavos = (int) ((valor - cedulas) * 100);

        int notas100 = cedulas / 100;
        cedulas -= notas100 * 100;
        int notas50 = cedulas / 50;
        cedulas -= notas50 * 50;
        int notas20 = cedulas / 20;
        cedulas -= notas20 * 20;
        int notas10 = cedulas / 10;
        cedulas -= notas10 * 10;
        int notas5 = cedulas / 5;
        cedulas -= notas5 * 5;
        int notas2 = cedulas / 2;
        cedulas -= notas2 * 2;

        int moedas1 = cedulas;
        int moedas50 = centavos / 50;
        centavos -= moedas50 * 50;
        int moedas25 = centavos / 25;
        centavos -= moedas25 * 25;
        int moedas10 = centavos / 10;
        centavos -= moedas10 * 10;
        int moedas5 = centavos / 5;
        centavos -= moedas5 * 5;
        int moedas01 = centavos;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

        sc.close();

    }

}
