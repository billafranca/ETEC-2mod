public class Impressora {

    public void imprimirNome(String nome){
        System.out.println("nome: " + nome);
    }

    public static void main(String[] args) {
        Impressora nome = new Impressora();
        nome.imprimirNome("boa");
    }
}
