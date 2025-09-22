package exeMetodos;

public class Exe22 {
    public void areas(double base, double altura){
        double resultado = (base * altura);
        System.out.println("a área do retângulo é: " + resultado);
    }
    public void areas(double lado){
        double resultado = Math.pow(lado, 2);
        System.out.println("a área do quadrado é: " + resultado);
    }
    public static void main(String[] args) {
        Exe22 ex = new Exe22();
        ex.areas(21.3, 22.7);
        ex.areas(44);


    }

}