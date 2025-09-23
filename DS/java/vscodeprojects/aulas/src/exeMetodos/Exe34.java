package exeMetodos;

public class Exe34 {
    public static void exibirMensagem(){
        for(int i = 0; i < 3; i++){
            String mensagem = "Bem-vindo";
            System.out.println(mensagem);
        }
    }

    public static void main(String[] args) {
        Exe34 ex = new Exe34();
        ex.exibirMensagem();
    }
}