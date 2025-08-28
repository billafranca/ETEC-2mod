import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que deseja calcular?\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n" +
                "4 - Potenciação\n5 - Área do Quadrado\n6 - Área do Retângulo\n7 - Área do Triângulo\n 8 -" +
                " Área do Circulo\n9 - Volume do Cone\n10 - Volume do Cubo\n11 - Fórmula Quadrática");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.println("Termo 1: ");
                double a = scanner.nextDouble();
                System.out.println("Termo 2: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + somar(a, b));
                break;
            }
            case 2 -> {
                System.out.println("Termo 1: ");
                double a = scanner.nextDouble();
                System.out.println("Termo 2: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + subtrair(a, b));
                break;
            }
            case 3 -> {
                System.out.println("Termo 1: ");
                double a = scanner.nextDouble();
                System.out.println("Termo 2: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + multiplicar(a, b));
                break;
            }
            case 4 -> {
                System.out.println("Base: ");
                double a = scanner.nextDouble();
                System.out.println("Expoente: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + elevar(a, b));
                break;
            }
            case 5 -> {
                System.out.println("Lado: ");
                double a = scanner.nextDouble();
                System.out.println("Resultado: " + areaQuadrado(a) + "u^2");
                break;
            }
            case 6 -> {
                System.out.println("Base: ");
                double a = scanner.nextDouble();
                System.out.println("Altura: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + areaRetangulo(a, b));
                break;
            }
            case 7 -> {
                System.out.println("Base: ");
                double a = scanner.nextDouble();
                System.out.println("Altura: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + areaTriangulo(a, b));
                break;
            }
            case 8 -> {
                System.out.println("Raio: ");
                double a = scanner.nextDouble();
                System.out.println("Resultado: " + areaCirculo(a));
                break;
            }
            case 9 -> {
                System.out.println("Raio: ");
                double a = scanner.nextDouble();
                System.out.println("Altura: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + volumeCone(a, b));
                break;
            }
            case 10 -> {
                System.out.println("Lado: ");
                double a = scanner.nextDouble();
                System.out.println("Resultado: " + volumeCubo(a));
                break;
            }
            case 11 -> {
                System.out.println("a: ");
                double a = scanner.nextDouble();
                System.out.println("b: ");
                double b = scanner.nextDouble();
                System.out.println("c: ");
                double c = scanner.nextDouble();
                System.out.println("Resultado: " + quadratica(a, b, c));
                break;
            }
        }

        scanner.close();
    }

    public static double somar(double n, double k) {
        return n + k;
    }
    public static double subtrair(double n, double k) {
        return n - k;
    }
    public static double multiplicar(double n, double k) {
        return n * k;
    }
    public static double elevar(double n, double k) {
        return Math.pow(n, k);
    }
    public static double areaQuadrado(double l) {
        return Math.pow(l, 2);
    }
    public static double areaRetangulo(double n, double k) {
        return n * k;
    }
    public static double areaTriangulo(double l, double h) {
        return (l * h) / 2;
    }
    public static double areaCirculo(double r) {
        return (Math.PI * Math.pow(r, 2));
    }
    public static double volumeCone(double r, double h) {
        return ((Math.PI * Math.pow(r, 2)) * 3) / 3;
    }
    public static double volumeCubo(double l) {
        return Math.pow(l, 3);
    }
    public static String quadratica(double a, double b, double c) {
        double x1, x2;
        String retorno;
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            retorno = -b + " +- √" + -(delta) + "i / " + 2 * a;
            return retorno;
        } else {
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            retorno = "x1 = " + x1 + "\nx2 = " + x2;
            return retorno;
        }
    }
}