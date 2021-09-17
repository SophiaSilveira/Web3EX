/**
 * 4. Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.
 */

public class Pares {
    public static void main(String []args){
        System.out.println("Números pares até 100. ");

        for(int i=0; i<=100; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
