package Vue.Menu;

import main.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GetAction extends AbstractAction {
    private Menu menu;

    public GetAction(Menu menu, String texte){
        super(texte);

        this.menu = menu;
    }

    public void actionPerformed(ActionEvent e) {
        String pseudo1 = menu.getTextFieldPseudo1().getText();
        menu.getLabelPseudo().setText(pseudo1);
    }
}
