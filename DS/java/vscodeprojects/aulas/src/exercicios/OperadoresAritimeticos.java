import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        System.out.print("num1: ");
        double num1 = sc.nextDouble();
        System.out.print("num2: ");
        double num2 = sc.nextDouble();

        double soma = (num1 + num2);
        double sub = (num1 - num2);
        double div = (num1 / num2);
        double mult = (num1 * num2);

        System.out.println("os resultados das operações são: " +  soma + sub + div + mult);

        sc.close();






    }
}
