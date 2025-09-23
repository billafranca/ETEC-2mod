package exeMetodos;

public class Exe29 {
    private String tipo;
    private String som;

    private void setTipo(String tipo){
        this.tipo = tipo;
    }
    private String getTipo(){
        return tipo;
    }
    private void setSom(String som){
        this.som = som;
    }
    private String getSom(){
        return som;
    }

    public static void main(String[] args) {
        Exe29 ex = new Exe29();
        ex.setTipo("cachorro");
        System.out.println("tipo: " + ex.getTipo());
        ex.setSom("au au");
        System.out.println("som: " + ex.getSom());
    }
}