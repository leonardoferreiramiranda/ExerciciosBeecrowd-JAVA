package ExerciciosIniciantes45ao49;

import java.io.IOException;
import java.util.Scanner;

/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda
para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas
as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.
 */
public class Exercicio1049 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        if(a.equalsIgnoreCase("VERTEBRADO")) {
            if (b.equalsIgnoreCase("AVE")) {
                if (c.equalsIgnoreCase("CARNIVORO")) {
                    System.out.println("aguia");
                } else if (c.equalsIgnoreCase("ONIVORO")) {
                    System.out.println("pomba");
                }
            } else if (b.equalsIgnoreCase("MAMIFERO")) {
                if (c.equalsIgnoreCase("ONIVORO")) {
                    System.out.println("homem");
                } else if (c.equalsIgnoreCase("HERBIVORO")) {
                    System.out.println("vaca");
                }
            }
        } else if(a.equalsIgnoreCase("INVERTEBRADO")) {
            if (b.equalsIgnoreCase("INSETO")) {
                if (c.equalsIgnoreCase("HEMATOFAGO")) {
                    System.out.println("pulga");
                } else if (c.equalsIgnoreCase("HERBIVORO")) {
                    System.out.println("lagarta");
                }
            } else if (b.equalsIgnoreCase("ANELIDEO")) {
                if (c.equalsIgnoreCase("HEMATOFAGO")) {
                    System.out.println("sanguessuga");
                } else if (c.equalsIgnoreCase("ONIVORO")) {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }

}
