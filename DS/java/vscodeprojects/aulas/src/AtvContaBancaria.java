import java.util.Scanner;


public class AtvContaBancaria{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----dados do cliente------");

        System.out.println("sr ClienteMaster");


        System.out.println("digite o número da sua conta corrente: ");

        int contaCorrente = sc.nextInt();
        System.out.println("número da conta corrente: " + contaCorrente);


        System.out.println("digite o número da agência bancária: ");
        int agencia = sc.nextInt();
        System.out.println("número da agência bancária: " + agencia);


        System.out.println("insira seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("olá, " + nomeCliente);


        double saldo = 4932.93;
        System.out.println("seu saldo é de: " + saldo);

        sc.close();

        


    }
}