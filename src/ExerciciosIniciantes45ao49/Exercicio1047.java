package ExerciciosIniciantes45ao49;

import java.io.IOException;
import java.util.Scanner;

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */

public class Exercicio1047 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int horaI = sc.nextInt();
        int minI = sc.nextInt();
        int horaF = sc.nextInt();
        int minF = sc.nextInt();

        int horaIEmMinutos = horaI * 60 + minI;
        int horaFEmMinutos = horaF * 60 + minF;

        if( horaFEmMinutos > horaIEmMinutos) {
            System.out.println("O JOGO DUROU " + (horaFEmMinutos - horaIEmMinutos) / 60 + " HORA(S) E "
                    + (horaFEmMinutos - horaIEmMinutos) % 60 + " MINUTO(S)");
        } else if ( horaIEmMinutos > horaFEmMinutos) {
            System.out.println("O JOGO DUROU " + (((24*60) - horaIEmMinutos) + horaFEmMinutos) / 60 + " HORA(S) E "
                    + (((24*60) - horaIEmMinutos) + horaFEmMinutos) % 60 + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }

        sc.close();
    }
}
