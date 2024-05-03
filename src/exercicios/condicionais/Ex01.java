package exercicios.condicionais;

import java.util.Scanner;

public class Ex01 {

    /*
        Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
        informados	valores	iguais)	e	escrever	o	maior	deles.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1);
        }
        if (numero2 > numero1){
            System.out.println(numero2);
        }
    }
}
