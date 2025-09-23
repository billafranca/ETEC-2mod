package exeMetodos;

public class Exe27 {
    private double preco;
    private String nome;

    // setter e getter de nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // setter e getter de preco
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public static void main(String[] args) {
        Exe27 ex = new Exe27();
        ex.setNome("camiseta");
        System.out.println("nome: " + ex.getNome());
        ex.setPreco(10.90);
        System.out.println("preço: " + ex.getPreco());
    }
}
