package aulas;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scan.next();

        System.out.println("Olá " + nome + " seja bem vindo!");

        System.out.println("Escreva sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Idade: " + idade);
    }

}
