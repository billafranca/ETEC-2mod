// metodo get e set //

public class Pessoa {
    private String nome;


//metodo set //
    public void setNome(String nome){
        this.nome = nome;
    }

    // metodo get //
    public String getNome(){
        return nome;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("josefino delgado");
        System.out.println("nome: " + pessoa.getNome());
    }
}
