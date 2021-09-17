/**
 * 11. Faça um algoritmo que leia a primeira letra do estado civil de uma pessoa e informe o estado civil.
S - solteiro
C - Casado
D - Divorciado
V - Viúvo
 */

 import java.util.Scanner;

public class EstadoCivil {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        String nome;
        String estadoC;

        for(int i =0; i<=10; i ++){
            System.out.println("\n" + "Olá, informe seu nome: ");
            nome = read.nextLine();
            System.out.println("Informe seu estado civil com uma letra. Ex.: S de 'solteiro(a)' ");
            estadoC = read.nextLine();

            switch(estadoC){
                case "S":
                System.out.println(nome + " seu estado civil é solteiro(a).");
                break;

                case "C":
                System.out.println(nome + " seu estado civil é casado(a).");
                break;

                case "D":
                System.out.println(nome + " seu estado civil é divorciado(a).");
                break;

                case "V":
                System.out.println(nome + " seu estado civil é viúvo(a).");
                break;

                default:
                System.out.println(nome + " desculpe não entendi.");
           }
        }
    }
}
