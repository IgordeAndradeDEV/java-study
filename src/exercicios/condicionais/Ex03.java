package exercicios.condicionais;

import java.util.Scanner;

public class Ex03 {

    /*
        As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma
        dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um
        programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o
        valor	total	da	compra
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero de maças: ");
        int quantidade = scan.nextInt();

        if (quantidade <=11) {
            System.out.println("Valor unitário R$ 0,30");
            System.out.println(quantidade * 0.30);
        } else {
            System.out.println("Valor unitário R$ 0,25");
            System.out.println(quantidade * 0.25);
        }
    }

}
