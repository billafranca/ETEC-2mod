import java.util.Scanner;

public class OperadorResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if(numero %2 == 0){
            System.out.println("par");
        }else{
            System.out.println("ímpar");
        }
    }
}
