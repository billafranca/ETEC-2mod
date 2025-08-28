package scanner;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("olá, " + nome + "!");


        sc.close();

    }


}
