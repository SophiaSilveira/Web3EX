/**
 * 3.Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 250.
 */


 public class ImparesUm{
     public static void main(String[] args){
        System.out.println("Números ímpares de 1 até 250.");

         for(int i=0; i<=250; i++){
             if(i % 2 != 0){
                 System.out.println(i);
             }
         }
     }
 }