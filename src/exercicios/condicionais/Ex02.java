package exercicios.condicionais;

import java.util.Scanner;

public class Ex02 {

    /*
        Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida
        pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 1234.	Devem	 ser	impressas	 as
        seguintes	mensagens:
        ACESSO	PERMITIDO	caso	a	senha	seja	válida.
        ACESSO	NEGADO	caso	a	senha	seja	inválida
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senha = scan.nextInt();

        if (senha ==1234) {
            System.out.println("Acesso liberado ");
        } else {
            System.out.println("Acesso negado");
        }
    }

}
