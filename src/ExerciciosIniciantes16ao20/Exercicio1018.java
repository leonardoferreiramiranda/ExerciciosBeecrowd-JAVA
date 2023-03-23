package ExerciciosIniciantes16ao20;

import java.io.IOException;
import java.util.Scanner;

/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará
a mensagem: “Presentation Error”.
 */

public class Exercicio1018 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int cedulas = valor;

        int nota100 = cedulas / 100;
        cedulas -= nota100 * 100;
        int nota50 = cedulas / 50;
        cedulas -= nota50 * 50;
        int nota20 = cedulas / 20;
        cedulas -= nota20 * 20;
        int nota10 = cedulas / 10;
        cedulas -= nota10 * 10;
        int nota5 = cedulas / 5;
        cedulas -= nota5 * 5;
        int nota2 = cedulas / 2;
        cedulas -= nota2 * 2;
        int nota1 = cedulas;

        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
