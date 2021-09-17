/**
 * 12. Crie um programa que receba uma temperatura como valor
 *  e diga se na temperatura passada por parâmetro 
 * a água estaria em estado sólido, líquido ou gasoso.
 */

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int temp;

        for(int i = 0; i<10; i++){

            System.out.println("--------------------------------------------------------------"+ "\n" + 
                                "Informe uma temperatura para saber o estado da água");
            temp = read.nextInt();

            if(temp<=0){
                System.out.println("Na temperatura " + temp + " a água está no estado sólido!");
            } else if(temp>0 && temp<100){
                System.out.println("Na temperatura " + temp + " a água está no estado liquido!");
            }else if(temp>=100){
                System.out.println("Na temperatura " + temp + " a água está no estado gasoso!");
            }else{
                System.out.println("Não é valido. Insira somente números.");
            }
       }
    }
}
