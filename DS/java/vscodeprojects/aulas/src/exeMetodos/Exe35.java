package exeMetodos;

public class Exe35 {
    public static boolean exibirPar(double numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Exe35 ex = new Exe35();
        boolean resultado = ex.exibirPar(2);
        System.out.println("par(true); impar(false). " + resultado);
    }
}
