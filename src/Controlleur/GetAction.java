/**
 * Classe GetAction.
 * Pour récuperer les valeurs des textFields
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */
package Controlleur;
import Vue.Menu.FenetrePrincipale;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GetAction extends AbstractAction {
    private FenetrePrincipale menuJoueur;

    public GetAction(FenetrePrincipale menuJoueur, String texte){
        super(texte);
        this.menuJoueur = menuJoueur;
    }

    public void actionPerformed(ActionEvent e) {
        String pseudo1 = menuJoueur.getTextFieldPseudo1().getText();
        menuJoueur.getLabelPseudo().setText("Salut "+pseudo1+" ! ");
        String pseudo2 = menuJoueur.getTextFieldPseudo2().getText();
        menuJoueur.getLabelPseudo2().setText("Salut "+pseudo2+" ! ");
        String pseudo3 = menuJoueur.getTextFieldPseudo3().getText();
        menuJoueur.getLabelPseudo3().setText("Salut "+pseudo3+" ! ");
        String pseudo4 = menuJoueur.getTextFieldPseudo4().getText();
        menuJoueur.getLabelPseudo4().setText("Salut "+pseudo4+" ! ");

        //String nb = menuJoueur.getSelection().getActionCommand();
       // System.out.println("Le radio bouton sélectionné est: " +nb);
    }
}
