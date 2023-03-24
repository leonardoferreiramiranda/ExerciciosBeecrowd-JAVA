package ExerciciosIniciantes21a;

import java.io.IOException;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule
e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme
tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */

public class Exercicio1038 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if(1 == codigo) System.out.printf("Total: R$ %.2f%n", 4.00 * quantidade);
        if(2 == codigo) System.out.printf("Total: R$ %.2f%n", 4.50 * quantidade);
        if(3 == codigo) System.out.printf("Total: R$ %.2f%n", 5.00 * quantidade);
        if(4 == codigo) System.out.printf("Total: R$ %.2f%n", 2.00 * quantidade);
        if(5 == codigo) System.out.printf("Total: R$ %.2f%n", 1.50 * quantidade);

        sc.close();

    }
}
