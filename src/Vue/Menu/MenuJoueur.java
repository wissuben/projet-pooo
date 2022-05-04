/**
 * Classe MenuJoueur.
 * Pour choisir le nombre de joueur et saisir leurs pseudos
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */
package Vue.Menu;

import main.Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuJoueur extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    /**
     * Launch the application.
     */
    private JPanel panel;
   /* public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuJoueur frame = new MenuJoueur();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    /**
     * Creation de la fenetre.
     */
    public MenuJoueur() {
        setTitle("The Island");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 600);
        setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setBackground(Color.BLUE);
        panel.setLayout(new BorderLayout(0, 0));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("THE ISLAND");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Noteworthy", Font.PLAIN, 26));
        lblNewLabel_4.setBounds(330, 8, 299, 56);
        panel.add(lblNewLabel_4);

        JRadioButton rdbtn2 = new JRadioButton("2");
        rdbtn2.setForeground(Color.WHITE);
        rdbtn2.setBounds(130, 120, 40, 23);
        panel.add(rdbtn2);

        JRadioButton rdbtn4 = new JRadioButton("4");
        rdbtn4.setForeground(Color.WHITE);
        rdbtn4.setBounds(259, 120, 141, 23);
        panel.add(rdbtn4);

        JLabel lblNombreJoueur = new JLabel("Choisissez le nombre de joueurs :");
        lblNombreJoueur.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        lblNombreJoueur.setForeground(Color.WHITE);
        lblNombreJoueur.setBounds(35, 80, 262, 23);
        panel.add(lblNombreJoueur);

        JLabel lblPseudo = new JLabel("Saissez vos pseudos joueurs :");
        lblPseudo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        lblPseudo.setForeground(Color.WHITE);
        lblPseudo.setBounds(35, 160, 262, 23);
        panel.add(lblPseudo);

        /**
         ** Pseudo1 **
         */
        JTextField textFieldPseudo1 = new JTextField();
        textFieldPseudo1.setColumns(10); //On lui donne un nombre de colonnes à afficher
        textFieldPseudo1.setBounds(249, 202, 252, 36);
        panel.add(textFieldPseudo1);

        /**
        ** Pseudo2 **
         */
        JTextField textFieldPseudo2 = new JTextField();
        textFieldPseudo2.setColumns(10);
        textFieldPseudo2.setBounds(249, 260, 252, 36);
        panel.add(textFieldPseudo2);

        /**
        ** Pseudo3 **
         */
        JTextField textFieldPseudo3 = new JTextField();
        textFieldPseudo3.setColumns(10);
        textFieldPseudo3.setBounds(249, 326, 252, 36);
        panel.add(textFieldPseudo3);

        /**
        ** Pseudo4 **
         */
        JTextField textFieldPseudo4 = new JTextField();
        textFieldPseudo4.setColumns(10);
        textFieldPseudo4.setBounds(249, 387, 252, 36);
        panel.add(textFieldPseudo4);

        /**
         ** Label joueurs **
         */
        JLabel lblJoueur1 = new JLabel("Joueur 1 :");
        lblJoueur1.setBounds(113, 202, 76, 39);
        lblJoueur1.setForeground(Color.WHITE);
        panel.add(lblJoueur1);

        JLabel lblJoueur2 = new JLabel("Joueur 2 :");
        lblJoueur2.setBounds(113, 259, 60, 40);
        lblJoueur2.setForeground(Color.WHITE);
        panel.add(lblJoueur2);

        JLabel lblJoueur3 = new JLabel("Joueur 3 :");
        lblJoueur3.setBounds(113, 325, 60, 36);
        lblJoueur3.setForeground(Color.WHITE);
        panel.add(lblJoueur3);

        JLabel lblJoueur4 = new JLabel("Joueur 4 :");
        lblJoueur4.setBounds(113, 386, 60, 36);
        lblJoueur4.setForeground(Color.WHITE);
        panel.add(lblJoueur4);

        /**
         ** Button continuer & ActionEvent **
         */
        JButton btnContinuer = new JButton("Continuer");
        btnContinuer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source == btnContinuer){
                    System.out.println("Vous avez cliqué sur continuer.");
                }
                Menu t1=new Menu();
              //  this.hide();
            }
        });

        btnContinuer.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        btnContinuer.setBackground(Color.BLUE);
        btnContinuer.setForeground(Color.BLACK);
        btnContinuer.setBounds(290, 450, 236, 56);
        panel.add(btnContinuer);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
