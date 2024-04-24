package aulas;

import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {
        /*
        * Escreva um program que leia o nome, a idade e peso
        * e imprima essas informações no terminal
        * */
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scan.next();

        System.out.println("Escreva sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Escreva seu peso: ");
        float peso = scan.nextFloat();



    }

}
