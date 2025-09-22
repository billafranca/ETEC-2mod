package exeMetodos;

public class Exe25 {

    public void exibirCaractere(char nome) {
        System.out.println(nome);
    }

    public void exibirCaractere(String nome){
        System.out.println(nome);
    }

    public static void main(String[] args) {
        Exe25 ex = new Exe25();


        ex.exibirCaractere('a');
        ex.exibirCaractere('l');
        ex.exibirCaractere('o');


        ex.exibirCaractere("mundo");
    }
}
