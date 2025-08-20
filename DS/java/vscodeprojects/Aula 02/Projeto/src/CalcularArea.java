import javax.swing.JOptionPane;

public class CalcularArea {
    public static void main(String[] args){

    int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "qual área deseja calcular? \n1- quadrado \n2- retângulo\n3-triângulo"));
    

    if(escolha == 1){
        double ladoQuadrado = Double.parseDouble(JOptionPane.showInputDialog("coloque a área do quadrado: "));
        double area = ladoQuadrado * 2;
        JOptionPane.showMessageDialog(null, "a área é: " + area);
    }
    if(escolha == 2){
        double base = Double.parseDouble(JOptionPane.showInputDialog("insira a base do retângulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("insira a altura do retângulo: "));
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "a área é: " + area);
    }
    if(escolha == 3){
        double base = Double.parseDouble(JOptionPane.showInputDialog("insira o valor da base do triângulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("insira a altura do triângulo: "));
        double area = (base * altura) /2;
        JOptionPane.showMessageDialog(null, "a área é: " + area);
        }
    }

    

}
