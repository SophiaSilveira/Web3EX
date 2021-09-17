/**
 *  6. Crie um programa onde será exibido quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.
 */

import java.util.Scanner;

public class Idade {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int idade = 0;
        int id = 0;

        for(int i=1; i<=10; i++){
            System.out.println("Informe sua idade: " + i);
            idade = read.nextInt();

           if(idade >= 18){
               id++;
           }if(i==10){
               System.out.println("Dentre dez pessoas " + id + " são maiores de idade.");
           } else{
           }
        }
    }
}
