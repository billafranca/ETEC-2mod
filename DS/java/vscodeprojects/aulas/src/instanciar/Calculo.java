package instanciar;

import javax.swing.JOptionPane;

public class Calculo {
    String nome;
    int idade;
    int tarefas;

    int realizar;

    double num1;
    double num2;

    double res;

    void dados() {
        nome = "Pedro";
        idade = 20;
        System.out.println("Olá " + nome + "\n" +
                "Você tem: " + idade + " anos");
    }

    public void exibirCaso() {
        tarefas = 3;
        System.out.println("Você tem: " + tarefas + " tarefas pendentes.");
    }

    public void realizarTarefa() {
        realizar = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar quantas tarefas? "));
        if (realizar == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu realizar apenas 1 tarefa.");
        } else if (realizar == 2) {
            JOptionPane.showMessageDialog(null, "Você escolheu realizar apenas 2 tarefas.");
        } else if (realizar == 3) {
            JOptionPane.showMessageDialog(null, "Você escolheu realizar apenas 3 tarefas.");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

    public void FazerOperacoes() {

        JOptionPane.showMessageDialog(null, "realizando tarefa: (operação).");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        String escolher = JOptionPane.showInputDialog("Escolha a operação (+  -  *  /):");
        switch (escolher) {
            case "+":
                res = num1 + num2;
                JOptionPane.showMessageDialog(null, "A soma é: " + res);
                break;
            case "-":
                res = num1 - num2;
                JOptionPane.showMessageDialog(null, "A subtração é: " + res);
                break;
            case "*":
                res = num1 * num2;
                JOptionPane.showMessageDialog(null, "A multiplicação é: " + res);
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                    JOptionPane.showMessageDialog(null, "A divisão é: " + res);
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Calculo c = new Calculo();
        c.dados();
        c.exibirCaso();
        c.realizarTarefa();
        c.FazerOperacoes();
    }
}
