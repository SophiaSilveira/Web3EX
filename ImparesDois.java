/**
 * 9. Escreva um programa Java para imprimir na tela todos os números ímpares de 299 a 101 em ordem decrescente.
 */

public class ImparesDois {
    public static void main(String[] args){
        System.out.println("Números ímpares de 299 a 101 emm ordem derescente");
        for(int i =299; i >=101; i--){
            if((i % 2) !=0){
                System.out.println(i);
            }
        }
    }
}