package contateste;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ContaTeste {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta pedrao = new Conta();
        Conta andrezudo = new Conta();
        
        
        pedrao.saldo = (2456.00);
        
        pedrao.nomeCliente = JOptionPane.showInputDialog("nome do cliente: ");
        JOptionPane.showMessageDialog(null, "olá! " + pedrao.nomeCliente);

        
        pedrao.exibirSaldo();
        
        JOptionPane.showMessageDialog(null, pedrao.nomeCliente + " insira quanto deseja sacar: ");
        pedrao.sacar (sc.nextDouble());
        
        JOptionPane.showMessageDialog(null, pedrao.nomeCliente + " insira quanto deseja depositar: ");
        pedrao.depositar(sc.nextDouble());
        pedrao.exibirSaldo();
        
        pedrao.transferir(andrezudo, 200);
        pedrao.exibirSaldo();
        sc.close();
    }
        
}
