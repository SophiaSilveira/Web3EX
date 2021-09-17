/*
1. Crie um programa em Java para apresentar os 
resultados da tabuada de um número qualquer. 
O usuário informa qual o valor deseja e o programa 
deverá retornar o cálculo da tabuada de 0 a 10. 
Usar laço de repetição - Livre.
*/


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número para saber a sua tabuada: ");
        numero = read.nextInt();
 
       for(int x = 0; x <=10; x ++) {
            System.out.println(numero + "x" + x + "= " + numero*x);
        }
     }
}