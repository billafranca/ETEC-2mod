package exeMetodos;

public class Exe23 {


    public void exibir() {
        System.out.println("texto simples: Olá, seja bem-vindo!");
    }


    public void exibir(int repeticoes) {
        String textoRepetido = "texto repetido: Hola, bienvenido!";
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(textoRepetido);
        }
    }

    public static void main(String[] args) {
        Exe23 ex = new Exe23();

        ex.exibir();
        ex.exibir(250);
    }
}
