package ExerciciosIniciantes16ao20;

import java.io.IOException;
import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o
expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

public class Exercicio1019 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();

        int hora = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;



        System.out.println(hora + ":" + minutos +  ":" + segundos);

        sc.close();
    }
}
