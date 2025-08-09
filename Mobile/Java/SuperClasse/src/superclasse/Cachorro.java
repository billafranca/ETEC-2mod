
package superclasse;
import javax.swing.JOptionPane;


public class Cachorro extends Animal {

    public Cachorro(String nome, String raca, double peso) {
        super(nome);
    }
    public void fazerBarulho(){
        JOptionPane.showMessageDialog(null, nome +  "ruf ruf ruf");
    }
    
  
}
    

