/**
 * 10. Crie um programa que detecte se o cliente utilizou todo o seu limite de crédito durante o mês. 
 * O programa deverá ler o nome do cliente, o número da conta, o limite de crédito, o quanto ele gastou.
 *  Se ele não ultrapassou o limite de crédito, a resposta de retorno deverá ser: Crédito ativo, senão, excedeu o limite.
 */

import java.util.Scanner;

public class Limite{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        String nome = " ";
        int conta;
        int limite;
        int s1 = 0;
        int s2 =0;
        int s3 =0;
        int s4 = 0;
        int soma;

        System.out.println("Controle seu limite de crétido! Liberado 10 consultas. ");
        System.out.println("Informe seu nome: ");
        nome = read.nextLine();
        
        for(int i = 1; i <=10; i++){
            System.out.println("Olá " + nome);
            System.out.println("Informe o número da sua conta: ");
            conta = read.nextInt();
            System.out.println("Informe seu limite de crédito: ");
            limite = read.nextInt();
            System.out.println("Informe os gastos das semana 1, 2, 3 e 4: "+"\n"+ "Se não tiver passado a semana, informe 0");
            s1= read.nextInt();
            s2= read.nextInt();
            s3= read.nextInt();
            s4= read.nextInt();

            soma = (s1+s2+s3+s4);

            if(soma < limite){
                System.out.println("Crédito ativo:");
            }else{
                System.out.println("Excedeu o limite:");
            }
            System.out.println("*******************************************************");
        }
    }
}