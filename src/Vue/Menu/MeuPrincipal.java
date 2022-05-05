/**
 * Classe MenuPrincipal.
 * Démarrage de jeu
 *
 * @version 1.0
 *
 * @see UneAutreClasse(none)
 * @author Oumaima HAIMAR.
 */
package Vue.Menu;
import main.Fenetre;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MeuPrincipal implements ActionListener {
    private JButton Commencer;
    private JLabel imageMenu;

    private JButton valider;

    public MeuPrincipal() {
        Fenetre menu = new Fenetre("Menu");
        JPanel panel = new JPanel();
        menu.setContentPane(panel);

        panel.setBackground(Color.blue);

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("Images/TheIsland.jpeg"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        JLabel pic = new JLabel(new ImageIcon(img));
        panel.add(pic);

        valider = new JButton("Valider");
        valider.addActionListener( this);
        panel.add(valider);

        menu.setVisible(true);//On la rend visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == valider){
            /**
             * J'ai mis les affichages juste pour faciliter le débogage
             */
            System.out.println("Vous avez cliqué sur valider.");
        }
        new MenuJoueur();
    }

}