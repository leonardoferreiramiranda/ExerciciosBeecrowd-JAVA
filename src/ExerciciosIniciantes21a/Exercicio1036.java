package ExerciciosIniciantes21a;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as
raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima
o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima
sempre o final de linha após cada mensagem.
 */
public class Exercicio1036 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a == 0) | (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double R2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        sc.close();
    }

}
