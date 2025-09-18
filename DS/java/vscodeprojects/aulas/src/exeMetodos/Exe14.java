package exeMetodos;

public class Exe14 {
    public void exibirPositivo(int numero){
        if(numero < 0){
            System.out.println("negativo!");
        }else if(numero > 0){
            System.out.println("positivo!");
        }else if(numero == 0 ){
            System.out.println("neutro!");
        }


    }

    public static void main(String[] args) {
        Exe14 ex = new Exe14();
        ex.exibirPositivo(-3);
    }
}
