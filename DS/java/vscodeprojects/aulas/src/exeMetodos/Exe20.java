package exeMetodos;

public class Exe20 {
    public boolean idade(int numero){
        if(numero >= 18){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Exe20 ex = new Exe20();
        System.out.println(ex.idade(19));
    }
}