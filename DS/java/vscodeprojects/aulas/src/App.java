import java.util.Scanner;

public class App {
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("olá " + nome);

        
        System.out.println("digite um número: ");
        int numero = sc.nextInt();
        System.out.println("você colocou o número " + numero + " advinhei?");
    
        

        if (numero == numero){
            System.out.println("já sabia que acertaria.");

        }else{
            System.out.println("errei, que pena!");
        }
        sc.close();
    }
}
