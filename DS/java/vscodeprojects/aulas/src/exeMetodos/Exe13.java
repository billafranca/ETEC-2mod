package exeMetodos;

public class Exe13 {
    public void exibirNome(String nome){
        System.out.println("seu nome é: " + nome);
    }
    public void exibirIdade(int idade){
        System.out.println("sua idade é: " + idade);
    }

    public static void main(String[] args) {
        Exe13 ex = new Exe13();
        ex.exibirNome("pedroca");
        ex.exibirIdade(12);
    }
}
