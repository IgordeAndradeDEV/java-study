package aulas;

import java.util.Scanner;

public class Aula04_01 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite seu sexo: [M/F]");
        String sexo = scan.next();

        if (idade >= 18 && sexo.toUpperCase().equals("F")) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }

        /*
            tabela verdade
            true && true     -> true
            true && false    -> false
            false && false   -> false

            true || true    -> true
            true || false   -> true
            false || false  -> false
        *  */
    }

}
