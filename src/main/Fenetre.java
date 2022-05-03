package main;
import javax.swing.*;

public class Fenetre extends JFrame { // fenetre principal qu'on peut utilioser dans toutes les interfaces
    private JLabel label;
    public Fenetre(String titre){
        setTitle(titre); //On donne un titre à notr fenêtre
        setBounds(100,100, 850,600); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre sinn true
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
    }


}
