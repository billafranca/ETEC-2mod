package exeMetodos;

public class Exe21 {
    public void exibir(int numeroInteiro){
        System.out.println("número inteiro: " + numeroInteiro);
    }
    public void exibir(double numeroReal){
        System.out.println("número real: " + numeroReal);
    }
    public static void main(String[] args) {
        Exe21 ex = new Exe21();
        ex.exibir(12);
        ex.exibir(22.5);
    }
}


