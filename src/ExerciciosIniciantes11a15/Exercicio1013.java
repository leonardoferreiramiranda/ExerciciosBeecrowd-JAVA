package ExerciciosIniciantes11a15;

import java.io.IOException;
import java.util.Scanner;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para
chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

public class Exercicio1013 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c) {
            System.out.println(a + " eh o maior");
        } else if (b > c) {
            System.out.println(b + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }

        sc.close();

    }
}
