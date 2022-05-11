package Vue.Menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame {

    public frame() {
        JFrame obj = new JFrame("MENU PRINCIPAL");

        JButton b1 = new JButton("Jouer");
        JButton b2 = new JButton("Classement");
        JButton b3 = new JButton("Crédits");

        JLabel image = new JLabel(new ImageIcon("Images/backgroundmenu.png"));

        image.setBounds(0, 0, 850, 600);
        // obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
        obj.add(image);
        b1.setBounds((850 / 2 - 100 / 2), 300, 200, 40);
        image.add(b1);

        b2.setBounds((850 / 2 - 100 / 2), 350, 200, 40);
        image.add(b2);

        b3.setBounds((850 / 2 - 100 / 2), 400, 100, 40);
        image.add(b3);

        obj.setSize(850, 600);
        obj.setVisible(true);
    }

    public static void main(String args[]) {
        new frame();
    }
}
