package exeMetodos;

public class Exe40 {
    public void esportes(){
        System.out.println("esportes: ");
    }

    public static void main(String[] args) {
        Exe40 ex = new Exe40();
        Exe40 futebol = new futebol();
        Exe40 basquete = new basquete();
        ex.esportes();
        futebol.esportes();
        basquete.esportes();
    }

}
class futebol extends Exe40{
    @Override
    public void esportes(){
        System.out.println("futebol:  jogado com os pes cujo objetivo e fazer gol");
    }
}
class basquete extends Exe40{
    @Override
    public void esportes(){
        System.out.println("basquete:  jogado com as maos cujo objetivo e fazer a cesta");
    }
}