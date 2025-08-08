
package contateste;

import javax.swing.JOptionPane;

public class Conta {
    public double saldo;
    public String nomeCliente;
    
    public void sacar(double valor){ 

        if(valor > saldo){
            JOptionPane.showMessageDialog(null, "saldo insuficiente! ");
            
    } else{
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "saque realizado com sucesso! ");
                    }
        }

    public void depositar(double valor){
        saldo += valor;
        JOptionPane.showMessageDialog(null, "depósito realizado com sucesso!");
        
    }
    
     public void exibirSaldo(){
        JOptionPane.showMessageDialog(null, nomeCliente + ", seu saldo é R$" + saldo);
     
}
     public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
        JOptionPane.showMessageDialog(null, "você transferiu" + valor);
        
     }
}
    
       
