public class DadosAluno {
    public String nomeAluno(){
        return "josefino";
    }

    public static void main(String[] args) {
        DadosAluno dados = new DadosAluno();
        System.out.println("nome do aluno: " + dados.nomeAluno());
    }
}
