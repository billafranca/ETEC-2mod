package exeMetodos;

public class Exe19 {
    public String concatenando(String nomeUm){
        return nomeUm;
    }
    public String concatenando2(String nomeDois){
        return nomeDois;
    }

    public static void main(String[] args) {
        Exe19 ex = new Exe19();
        String um, dois;
        um = ex.concatenando("olá ");
        dois = ex.concatenando2(" mundo! ");
        System.out.println(um + dois);
    }
}