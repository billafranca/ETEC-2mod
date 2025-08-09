
package superclasse;
import javax.swing.JOptionPane;

public class Animal {
       public String nome;
       public String raca;
       public double peso;

    public Animal(String nome) {
    }

    public Animal(String nome, String raca) {
    }
    
       
       

    public Animal(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }
   
       

    public void fazerBarulho(){
    JOptionPane.showMessageDialog(null,  nome + "ruuf ruuf");

}
    
    
}
