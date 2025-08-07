import java.util.Scanner;
public class Soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first term: ");
        double num1 = sc.nextDouble();
        System.out.println("enter the second term: ");
        double num2 = sc.nextDouble();
        double res = num1 + num2;
        System.out.println("the result is: " + res);
        sc.close();
    }
}
