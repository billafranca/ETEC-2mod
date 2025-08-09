
package superclasse;
import javax.swing.JOptionPane;

public class Galinha extends Animal {
     
    public Galinha(String nome, String raca, double peso) {
        super(nome);
    }
    public void fazerBarulho(){
        JOptionPane.showMessageDialog(null, "galinha: " + "pó pó pó");
    }
}