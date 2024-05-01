package exercicios;

import java.util.Scanner;

public class Ex04 {

    /*
        Escreva um programa que leia 3 valores:
        hora, minuto e segundo
        e imprima na tela conforme o exemplo:

        15:30:20
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        int hora = scan.nextInt();

        System.out.println("Digite o minuto: ");
        int minuto = scan.nextInt();

        System.out.println("Digite o segundo ");
        int segundo = scan.nextInt();

        System.out.println(hora +":" + minuto +":" + segundo );


    }

}
