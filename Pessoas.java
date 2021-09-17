/**
 * 8. Elabore um algoritmo que some a idade de 5 pessoas e retorne o nome destas pessoas. 
 * O usuário deverá digitar o nome + a idade de 5 pessoas. O programa deverá retornar o nome das 5 pessoas + a soma da idade destas pessoas.
 */

import java.util.Scanner;

public class Pessoas {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        int idade = 0;
        int soma = 0;
        String p1;
        String p2;
        String p3;
        String p4;
        String p5;

        System.out.println("Informe o nome de 5 pessoas: ");
        p1 = read.nextLine();
        p2 = read.nextLine();
        p3 = read.nextLine();
        p4 = read.nextLine();
        p5 = read.nextLine();

        System.out.println("Informe as idades correspondentes");

        for(int i = 1; i<6; i++){

            System.out.println("Pessoa " + i);
            idade = read.nextInt();

            soma = idade+ soma;

            if(i==5){
                System.out.println("A idade de " + p1 + ", "+ p2 + ", " + p3 + ", " + p4 + ", " + p5 + ", " + " somadas é = " + soma);
            }
        }

    }
}
