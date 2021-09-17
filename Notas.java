/**
 * 5. Programa em Java que calcula a média das notas de uma turma:
 * Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
 * Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
 */
import java.util.Scanner;

public class Notas {
    public static void main(String [] args){
        Scanner read = new Scanner (System.in);

        double notas =0;
        double soma =0;
        double media =0;
        int alunos =0;
        int contagem = 1;
        int i = 0;

        System.out.println("Informe quantos alunos tem uma turma: ");
        alunos = read.nextInt();

        System.out.println("Agora informe as notas dos alunos: ");

        while(i <=alunos){
            
            notas = read.nextDouble();

            soma = notas +soma;
            i++;

            if(i<=alunos){
                System.out.println("Nota " + contagem);
                contagem ++;

            } if(i == alunos){
            media = soma/alunos;
            System.out.println("A média da turma é " + media);

            }else{

            }
        }
    }
}
