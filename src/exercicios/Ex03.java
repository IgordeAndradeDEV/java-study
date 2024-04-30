package exercicios;

import java.util.Scanner;

public class Ex03 {

    /*
        Escreva um programa que leia 3 valoes:
        dia , mês e ano
        e imprima na tela de duas formas:

        exemplo primeira forma:
        dia 15 do 10 de 2024

        exemplo segunda forma
        15/10/2024

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scan.nextInt();

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        System.out.println("dia " + dia + " do " + mes + " de " + ano );
        System.out.println(dia  +"/" + mes +"/" + ano);




    }

}
