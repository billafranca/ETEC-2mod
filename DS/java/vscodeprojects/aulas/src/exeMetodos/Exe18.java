package exeMetodos;

public class Exe18 {
    public double exibirDobro(double numero){
        return Math.pow(numero, 2);
    }

    public static void main(String[] args) {
        Exe18 ex = new Exe18();
        double exibir = ex.exibirDobro(12);
        System.out.println("o dobro é " + exibir);
    }
}