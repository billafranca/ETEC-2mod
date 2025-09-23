package exeMetodos;

public class Exe33 {
    public static void exibirDobro(double x){
        double dobro = Math.pow(x, 2);
        System.out.println("o dobro é: " + dobro);
    }

    public static void main(String[] args) {
        Exe33 ex = new Exe33();
        ex.exibirDobro(22);
    }
}