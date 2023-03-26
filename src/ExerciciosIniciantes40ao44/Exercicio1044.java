package ExerciciosIniciantes40ao44;

import java.io.IOException;
import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */

public class Exercicio1044 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        if ( primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0 ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
