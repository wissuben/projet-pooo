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

import main.Fenetre;
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

    private final JRadioButton rdbtn4;
    private final JLabel lblNombreJoueur;
    private final JLabel lblPseudo;
    private final JTextField textFieldPseudo1;
    private final JTextField textFieldPseudo2;
    private final JTextField textFieldPseudo4;
    private final JLabel lblJoueur4;
    private final JLabel lblJoueur3;
    private final JLabel lblJoueur1;
    private final JLabel lblJoueur2;
    private final JButton btnLancer;
    private JTextField textFieldPseudo3;
    private JLabel lblTitre;
    private JRadioButton rdbtn2;

    private static final long serialVersionUID = 1L;
    /**
     * Launch the application.
     */
    //private JPanel panel;
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
        Fenetre menuJoueur = new Fenetre("MenuJoueur");
        JPanel panell = new JPanel();
        menuJoueur.setContentPane(panell);

        panell.setBorder(new EmptyBorder(5, 5, 5, 5));
        panell.setBackground(Color.BLUE);
        panell.setLayout(new BorderLayout(0, 0));
        panell.setLayout(null);

        lblTitre = new JLabel("THE ISLAND");
        lblTitre.setForeground(Color.WHITE);
        lblTitre.setFont(new Font("Noteworthy", Font.PLAIN, 26));
        lblTitre.setBounds(330, 8, 299, 56);
        panell.add(lblTitre);

        rdbtn2 = new JRadioButton("2");
        rdbtn2.setForeground(Color.WHITE);
        rdbtn2.setBounds(130, 120, 40, 23);
        panell.add(rdbtn2);

        rdbtn4 = new JRadioButton("4");
        rdbtn4.setForeground(Color.WHITE);
        rdbtn4.setBounds(259, 120, 141, 23);
        panell.add(rdbtn4);

        lblNombreJoueur = new JLabel("Choisissez le nombre de joueurs :");
        lblNombreJoueur.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        lblNombreJoueur.setForeground(Color.WHITE);
        lblNombreJoueur.setBounds(35, 80, 262, 23);
        panell.add(lblNombreJoueur);

        lblPseudo = new JLabel("Saissez vos pseudos joueurs :");
        lblPseudo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        lblPseudo.setForeground(Color.WHITE);
        lblPseudo.setBounds(35, 160, 262, 23);
        panell.add(lblPseudo);

        /**
         ** Pseudo1 **
         */
        textFieldPseudo1 = new JTextField();
        textFieldPseudo1.setColumns(10); //On lui donne un nombre de colonnes à afficher
        textFieldPseudo1.setBounds(249, 202, 252, 36);
        panell.add(textFieldPseudo1);

        /**
        ** Pseudo2 **
         */
        textFieldPseudo2 = new JTextField();
        textFieldPseudo2.setColumns(10);
        textFieldPseudo2.setBounds(249, 260, 252, 36);
        panell.add(textFieldPseudo2);

        /**
        ** Pseudo3 **
         */
        textFieldPseudo3 = new JTextField();
        textFieldPseudo3.setColumns(10);
        textFieldPseudo3.setBounds(249, 326, 252, 36);
        panell.add(textFieldPseudo3);

        /**
        ** Pseudo4 **
         */
        textFieldPseudo4 = new JTextField();
        textFieldPseudo4.setColumns(10);
        textFieldPseudo4.setBounds(249, 387, 252, 36);
        panell.add(textFieldPseudo4);

        /**
         ** Label joueurs **
         */
        lblJoueur1 = new JLabel("Joueur 1 :");
        lblJoueur1.setBounds(113, 202, 76, 39);
        lblJoueur1.setForeground(Color.WHITE);
        panell.add(lblJoueur1);

        lblJoueur2 = new JLabel("Joueur 2 :");
        lblJoueur2.setBounds(113, 259, 60, 40);
        lblJoueur2.setForeground(Color.WHITE);
        panell.add(lblJoueur2);

        lblJoueur3 = new JLabel("Joueur 3 :");
        lblJoueur3.setBounds(113, 325, 60, 36);
        lblJoueur3.setForeground(Color.WHITE);
        panell.add(lblJoueur3);

        lblJoueur4 = new JLabel("Joueur 4 :");
        lblJoueur4.setBounds(113, 386, 60, 36);
        lblJoueur4.setForeground(Color.WHITE);
        panell.add(lblJoueur4);

        /**
         ** Button continuer & ActionEvent **
         */
        btnLancer = new JButton("Lancer le jeu");
        btnLancer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source == btnLancer){
                    /**
                     * J'ai mis les affichages juste pour faciliter le débogage
                     */
                    System.out.println("Vous avez cliqué sur Lancer.");
                }
                Menu t1=new Menu();
            }
        });

        btnLancer.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        btnLancer.setBackground(Color.BLUE);
        btnLancer.setForeground(Color.BLACK);
        btnLancer.setBounds(300, 480, 236, 56);
        panell.add(btnLancer);
        menuJoueur.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
