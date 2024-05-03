package exercicios.condicionais;

import java.util.Scanner;

public class Ex04 {

    /*
        Escreva um programa que leia um número e escreva na tela
        PAR se o número for par e IMPAR se o número for impar
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par ");

        } else {
            System.out.println("Impar ");
        }

    }

}
