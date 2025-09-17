// metodo raramente utilizado = finalize() //

public class Destrutor {
    protected void finalize() {
        System.out.println("Objeto removido pelo Garbage Collector");
    }

    public static void main(String[] args) {
        Destrutor dest = new Destrutor();
        dest = null;
        System.gc();
    }

}
