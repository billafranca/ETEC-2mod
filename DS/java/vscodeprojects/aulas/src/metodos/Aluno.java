// metodo construtor

public class Aluno {
    String nome;

    public Aluno(String nome){
        this.nome = nome;

    }
    public void exibirAluno(){
        System.out.println("nome do aluno: " + nome);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("pedrolas");
        aluno.exibirAluno();
    }
}
