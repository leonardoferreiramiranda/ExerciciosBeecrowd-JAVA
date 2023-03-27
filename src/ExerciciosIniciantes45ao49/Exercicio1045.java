package ExerciciosIniciantes45ao49;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior
dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre
escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
 */

public class Exercicio1045 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double validacao;

        if(b > a && b > c) {
            validacao = a;
            a = b;
            b = validacao;
        } else if(c > a && c > b) {
            validacao = a;
            a = c;
            c = validacao;

        }

        if(a >= b+c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if(a*a == (b*b) + (c*c)) System.out.println("TRIANGULO RETANGULO");
            if(a*a > (b*b) + (c*c)) System.out.println("TRIANGULO OBTUSANGULO");
            if(a*a < (b*b) + (c*c)) System.out.println("TRIANGULO ACUTANGULO");
            if(a == b && a == c) System.out.println("TRIANGULO EQUILATERO");
//          if(a == b && c != b) System.out.println("TRIANGULO ISOSCELES");
//          if(a == c && b != c) System.out.println("TRIANGULO ISOSCELES");
//          if(b == c && a != c) System.out.println("TRIANGULO ISOSCELES");
            if((a == b && c != b) || (a == c && b != c) || (b == c && a != c)) System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}
