import java.util.Scanner;

public  class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Teste tst = new Teste();

    System.out.println("Digite o seu nome: ");
    tst.nomeCliente = sc.nextLine();

    tst.saldoConta = 985;
    System.out.println("o valor que reside em sua conta é igual a " + tst.saldoConta);


    System.out.println("quanto deseja sacar? ");
    tst.sacar(sc.nextDouble());

    tst.mostrarMensagem();







}
}
