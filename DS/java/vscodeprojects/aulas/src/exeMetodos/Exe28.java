package exeMetodos;

public class Exe28 {
    private String titulo;
    private String autor;

    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    private String getTitulo(){
        return titulo;
    }
    private void setAutor(String autor){
        this.autor = autor;
    }
    private String getAutor(){
        return autor;
    }

    public static void main(String[] args) {
        Exe28 ex = new Exe28();
        ex.setTitulo("Literatura, pão e poesia");
        System.out.println("título: " + ex.getTitulo());
        ex.setAutor("Sérgio Vaz");
        System.out.println("autor: " + ex.getAutor());
    }
}