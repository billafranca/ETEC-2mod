package superclasse;
import javax.swing.JOptionPane;

public class SuperClasse {
    
    public static void main(String[] args) {
       Cachorro cachorro = new Cachorro("rex", "caramelo", 20.0);
       Galinha galinha = new Galinha("joaquina", "galinha", 8.8);
       Corvo corvo = new Corvo("delgado", "corvo", 6.0);
       
       cachorro.fazerBarulho();
       galinha.fazerBarulho();
       corvo.fazerBarulho();
       
       
       
       
    
    }
    
}
