package exeMetodos;

public class Exe26 {
    private String nome;
    private int idade;

    // setter //
    public void setNome(String nome){
        this.nome = nome;
    }
    // getter //
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public static void main(String[] args) {
        Exe26 ex = new Exe26();
        ex.setNome("Pedro");
        System.out.println("nome: " + ex.getNome());
        ex.setIdade(25);
        System.out.println("idade: " + ex.getIdade());
    }
}
