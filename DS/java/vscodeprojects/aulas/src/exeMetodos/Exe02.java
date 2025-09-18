package exeMetodos;

public class Exe02 {
    public void exibirNome(String nome){
        System.out.println("olá: " + nome);
    }

    public static void main(String[] args) {
        Exe02 ex = new Exe02();
        ex.exibirNome("Pedro Braga Billafranca");
    }
}
