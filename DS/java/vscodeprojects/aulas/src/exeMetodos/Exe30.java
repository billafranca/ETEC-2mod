package exeMetodos;

public class Exe30 {
    private double saldo;
    private String titular;

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    private double getSaldo(){
        return saldo;
    }
    private void setTitular(String titular){
        this.titular = titular;
    }
    private String getTitular(){
        return titular;
    }

    public static void main(String[] args) {
        Exe30 ex = new Exe30();
        ex.setTitular("Luís");
        System.out.println("olá, " + ex.getTitular());
        ex.setSaldo(250.00);
        System.out.println("seu saldo é: " + ex.getSaldo());
    }
}