package exeMetodos;

public class Exe24 {
    public void soma(int y, int x) {
        int result = y + x;
        System.out.println("the result is: " + result);
    }

    public void soma(int y, int x, int z) {
        int result = (y + x) + z;
        System.out.println("the result is: " + result);
    }

    public void soma(int y, int x, int z, int w) {
        int result = (y + x) + (z + w);
        System.out.println("the result is: " + result);
    }

    public static void main(String[] args) {
        Exe24 ex = new Exe24();
        ex.soma(12, 12);
        ex.soma(12, 12, 36);
        ex.soma(44, 11, 7, 3);
    }
}
