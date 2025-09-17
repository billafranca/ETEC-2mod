public class SobrecargaMetodos {
    // ocorre quando varios metodos tem o mesmo nome, mas parametros diferentes, seja em quantidade ou tipo //


    public void exibir(int x){
        System.out.println("valor inteiro: " + x);
    }
    public void exibir(String texto){
        System.out.println("texto: " + texto);

    }

    public void exibir(int x, String texto){
        System.out.println(x + " - " + texto);
    }

    public static void main(String[] args) {
        SobrecargaMetodos sobre = new SobrecargaMetodos();
        sobre.exibir(21);
        sobre.exibir("olá");
        sobre.exibir(24, "olá, método sobrecarga.");
    }
}

