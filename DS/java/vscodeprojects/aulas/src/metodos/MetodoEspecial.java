// metodo especial, static //

public class MetodoEspecial {
    public static void StaticMessage(){
        System.out.println("method!");
    }

    public static void main(String[] args) {
       MetodoEspecial metodo = new MetodoEspecial();
       metodo.StaticMessage();
    }

}
