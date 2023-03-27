package ExerciciosIniciantes45ao49;

import java.io.IOException;
import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em
um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
 */

public class Exercicio1046 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int calculoHoraInicial = 24 - (horaInicial - horaFinal);
        int calculoHoraFinal = horaFinal - horaInicial;

        if(horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU " + calculoHoraInicial + " HORA(S)");
        } else if(horaFinal > horaInicial) {
            System.out.println("O JOGO DUROU " + calculoHoraFinal + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
