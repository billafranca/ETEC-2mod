import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Insira sua altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Insira se você foi aprovado ou não (true ou false): ");
        boolean estaAprovado = scanner.nextBoolean();

        System.out.printf("\nNome: %s \nIdade: %s \nAltura: %.2f", nome, idade, altura);
        if (estaAprovado) {
            System.out.println("\nAluno está aprovado.");
        } else {
            System.out.println("\nAluno não está aprovado.");
        }
        scanner.close();
    }
}