package exeMetodos;

import javax.security.auth.callback.TextInputCallback;

public class Exe01 {
    public void exibirMensagem(){
        System.out.println("olá, mundo!");
    }

    public static void main(String[] args) {
        Exe01 ex = new Exe01();
        ex.exibirMensagem();
    }
}
