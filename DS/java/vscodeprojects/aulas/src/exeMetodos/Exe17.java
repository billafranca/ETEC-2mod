package exeMetodos;

public class Exe17 {
    public String exibirNomePersonalizado(String nome){
        return nome;
    }

    public static void main(String[] args) {
        Exe17 ex = new Exe17();
        System.out.println("olá" + ex.exibirNomePersonalizado("pedro") + "seja bem vindo!");
    }
}