public class CalculadoraSimples {
    public double multiplicar(double y, double x){
        return x * y;
    }

    public static void main(String[] args) {
        CalculadoraSimples mult = new CalculadoraSimples();
        double result = mult.multiplicar(5, 5);
        System.out.println("the result is: " + result);
    }
}
// metodo com parametros //