package ExerciciosIniciantes50ao52E59E60;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

public class Exercicio1060 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for(int i = 1; i <= 6; i++) {
            double valor = sc.nextDouble();
            if(valor == 0) {
                System.out.println("valor nulo");
            } else if(valor >= 1) {
                total++;
            }
        }
        System.out.println(total + " valores positivos");
    }
}
