
/**
 * 2. Crie um programa que receba vários números, calcule e mostre: 
•A soma dos números digitados 
•A quantidade de números digitados
•A média dos números digitados
•O maior número digitado
•O menor número digitado
•A média dos números pares 
 */

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double i = 0;
        double numero = 1;
        double soma = 0;
        double media = 0;
        double somaPares = 1;
        double maiorNumero = 0;
        double menorNumero = 0;
        double par =0;
        double mediaPar =0;
        
       while(i < 4) {
        System.out.println("Digite um número");
        numero = read.nextDouble();
        i++;
        soma = numero + soma;

            if(i==3){
            media = soma /i;
            }if(numero % 2 == 0){
               par = numero + par;
               mediaPar = par/somaPares;
                somaPares ++;
            }if(numero<menorNumero){
                menorNumero=numero;
            }if(numero>maiorNumero){
                maiorNumero=numero;
            }if(i==1){
                menorNumero=numero;
            }else{

            }
        }
        System.out.println("A soma dos números é = " + soma);
        System.out.println("A quantidade dos números é = " + i );
        System.out.println("A média é = " + media);
        System.out.println("O menor número é = " + menorNumero);
        System.out.println("O maior número é = " + maiorNumero);
        System.out.println("A média dos números pares é = " + mediaPar);
    }
}
