package exeMetodos;

public class Exe37 {
    public void transportes(){
        System.out.println("transportes: ");
    }


    public static void main(String[] args) {
        Exe37 ex = new Exe37();
        Exe37 carro = new carro();
        ex.transportes();
        carro.transportes();

    }
}
class carro extends Exe37{
    @Override
    public void transportes(){
        System.out.println(" o carro está em movimento. ");
    }
}