// metodo raramente utilizado = finalize() //

import java.lang.Object;
public class Destrutor {
    protected void finalize() throws Throwable {
        System.out.println("Objeto removido pelo Garbage Collector");
    }

    public static void main(String[] args) {
        Destrutor dest = new Destrutor();
        dest = null;
        System.gc();


    }

}
