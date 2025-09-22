import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        String menu = "O que deseja calcular?\n" +
                "1 - Soma\n2 - Subtração\n3 - Multiplicação\n" +
                "4 - Potenciação\n5 - Área do Quadrado\n6 - Área do Retângulo\n" +
                "7 - Área do Triângulo\n8 - Área do Círculo\n9 - Volume do Cone\n" +
                "10 - Volume do Cubo\n11 - Fórmula Quadrática";

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (escolha) {
            if(escolha == 1) {

                double a = Double.parseDouble(JOptionPane.showInputDialog("Termo 1:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Termo 2:"));

                while (Double.isNaN(a)){
                    JOptionPane.showMessageDialog(null, "digite apenas números! tente novamente");

                }
                JOptionPane.showMessageDialog(null, somar(a, b))
            }
            if(escolha == 2) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Termo 1:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Termo 2:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + subtrair(a, b));
            }
            if(escolha == 3) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Termo 1:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Termo 2:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + multiplicar(a, b));
            }
            if(escolha == 4) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Expoente:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + elevar(a, b));
            }
            if(escolha == 5) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Lado:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + areaQuadrado(a) + "u^2");
            }
            if(escolha == 6) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + areaRetangulo(a, b));
            }
            if(escolha == 7) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + areaTriangulo(a, b));
            }
            if(escolha == 8) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + areaCirculo(a));
            }
            if(escolha == 9) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + volumeCone(a, b));
            }
            if(escolha == 10) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Lado:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + volumeCubo(a));
            }
            if(escolha == 11) {
                double a = Double.parseDouble(JOptionPane.showInputDialog("a:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b:"));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c:"));
                JOptionPane.showMessageDialog(null, "Resultado:\n" + quadratica(a, b, c));
            }
        }
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
        return ((Math.PI * Math.pow(r, 2)) * h) / 3;
    }

    public static double volumeCubo(double l) {
        return Math.pow(l, 3);
    }

    public static String quadratica(double a, double b, double c) {
        double x1, x2;
        String retorno;
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            retorno = -b + " ± √" + -(delta) + "i / " + (2 * a);
        } else {
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            retorno = "x1 = " + x1 + "\nx2 = " + x2;
        }
        return retorno;
    }
}
