package exeMetodos;

public class Exe39 {

    public void exibirFuncionarios(){
        System.out.println("Funcionarios: ");
    }

    public static void main(String[] args) {
        Exe39 ex = new Exe39();
        Exe39 professor = new professor();
        Exe39 diretor = new diretor();
        ex.exibirFuncionarios();
        professor.exibirFuncionarios();
        diretor.exibirFuncionarios();
    }

}
class professor extends Exe39{
    @Override
    public void exibirFuncionarios(){
        System.out.println("professor está ensinando java!");
    }
}
class diretor extends Exe39{
    @Override
    public void exibirFuncionarios(){
        System.out.println("diretor está em home-office");
    }
}