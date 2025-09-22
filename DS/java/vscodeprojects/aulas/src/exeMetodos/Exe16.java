package exeMetodos;

public class Exe16 {
    public double somar(double y, double x){
        return x + y;
    }
    public double subtrair(double y, double x){
        return x - y;
    }
    public double multiplicar(double y, double x){
        return x * y;
    }

    public static void main(String[] args) {
        Exe16 ex = new Exe16();
        double result;
        result = ex.somar(13, 194);
        System.out.println("a soma é : " + result);
        result = ex.subtrair(22, 7);
        System.out.println("a subtração é: " + result);
        result = ex.multiplicar(305, 305);
        System.out.println("a multiplicação é: " + result);
    }
}

