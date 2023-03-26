package ExerciciosIniciantes40ao44;

import java.io.IOException;
import java.util.Scanner;

/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em
branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
 */

public class Exercicio1042 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();

        if(valorA < valorB && valorA  < valorC && valorB < valorC) {
            System.out.println(valorA);
            System.out.println(valorB);
            System.out.println(valorC);
        } else if(valorA < valorB && valorA  < valorC && valorB > valorC) {
            System.out.println(valorA);
            System.out.println(valorC);
            System.out.println(valorB);
        } else if(valorB < valorA && valorB < valorC && valorA < valorC) {
            System.out.println(valorB);
            System.out.println(valorA);
            System.out.println(valorC);
        } else if (valorB < valorA && valorB < valorC && valorA > valorC) {
            System.out.println(valorB);
            System.out.println(valorC);
            System.out.println(valorA);
        } else if (valorC < valorA && valorC < valorB && valorB < valorA) {
            System.out.println(valorC);
            System.out.println(valorB);
            System.out.println(valorA);
        } else if(valorC < valorA && valorC < valorB && valorB > valorA) {
            System.out.println(valorC);
            System.out.println(valorA);
            System.out.println(valorB);
        }

        System.out.println("");
        System.out.println(valorA);
        System.out.println(valorB);
        System.out.println(valorC);

        sc.close();
    }

}
