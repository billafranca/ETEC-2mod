import javax.swing.JOptionPane;

public class Ternario {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("insira sua idade: "));
        int idade_minima = 18;

        String mensagem = (idade >= idade_minima) ? "maior de idade" : "menor de idade";

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
