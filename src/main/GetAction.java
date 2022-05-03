package main;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GetAction extends AbstractAction {
    private Menu menu;

    public GetAction(Menu menu, String texte){
        super(texte);

        this.menu = menu;
    }

    public void actionPerformed(ActionEvent e) {
        String texteUtilisateur = menu.getTextField().getText();
        menu.getLabel().setText(texteUtilisateur);
    }
}
