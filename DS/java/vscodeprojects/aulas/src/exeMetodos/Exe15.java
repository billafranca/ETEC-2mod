package exeMetodos;

public class Exe15 {
    public void saudacaoPersonalizada(String nome){
        System.out.println("olá" + nome + "seja muito bem vindo!");
    }

    public static void main(String[] args) {
        Exe15 ex = new Exe15();
        ex.saudacaoPersonalizada("Pedro");
    }
}
