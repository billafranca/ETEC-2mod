package exeMetodos;

public class Exe38 {
    public void desenhar(){
        System.out.println("desenhos: ");
    }

    public static void main(String[] args) {
        Exe38 ex = new Exe38();
        Exe38 circulo = new circulo();
        Exe38 quadrado = new quadrado();
        ex.desenhar();
        quadrado.desenhar();
        circulo.desenhar();

    }
}
class circulo extends Exe38{
    @Override
    public void desenhar(){
        System.out.println("circulo: o");
    }
}
class quadrado extends Exe38{
    @Override
    public void desenhar(){
        System.out.println("quadrado: []");
    }
}