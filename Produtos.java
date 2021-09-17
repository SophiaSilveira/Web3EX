/**
 * 7. Faça um algoritmo que some o total de produtos digitados. 
 * O usuário deverá informar a quantidade de produtos que serão informados e o tipo de produto. 
 * Exemplo: O user digitou - arroz, feijão e batata --> o programa deverá exibir os produtos e o número "3".
 */
import java.util.Scanner;

public class Produtos {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);

        String produtos;
        int quantidade = 0;
        
        System.out.println("Informe a quantidade de produtos");
        quantidade = read.nextInt();
        System.out.println("Digite o tipo dos produtos");

        for(int i = 0; i<=quantidade; i++){
            produtos = read.nextLine();
            
            if(i==quantidade){
                System.out.println("O total dos produtos é: " + quantidade);
            }
        }
    }
}
