
import javax.swing.JOptionPane;


public class Calculadora {
    public static void main(String[] args) {



        double num1 = Integer.parseInt(JOptionPane.showInputDialog("enter the first number: "));


        double num2 = Integer.parseInt(JOptionPane.showInputDialog("enter the second number: "));


        String operation = JOptionPane.showInputDialog("Enter the operation (+ - / * %): ");


        double res = 0;


        switch (operation) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Cannot divide by zero.");
                    return;
                }
                break;
            case "%":
                res = num1 % num2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid operation.");
                return;
        }


        JOptionPane.showMessageDialog(null, "The result is: " + res);


    }
}
