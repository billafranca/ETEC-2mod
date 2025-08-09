
package superclasse;
import javax.swing.JOptionPane;


public class Corvo extends Animal {

    public Corvo(String nome, String raca, double peso) {
        super(nome);
    }
    public void fazerBarulho(){
        JOptionPane.showMessageDialog(null, nome + "quo quo quo");
    }
}
