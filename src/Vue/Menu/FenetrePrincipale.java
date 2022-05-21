package Vue.Menu;
import Controlleur.GetAction;
import Controlleur.RedimensionnerImage;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;

public class FenetrePrincipale implements ActionListener {
	   	JFrame frame;
	    int width;
	    int height;
	private JLabel lblTitre;
	private JRadioButton rdbtn2;
	private JLabel lblNombreJoueur;
	private JRadioButton rdbtn4;
	private JLabel lblPseudo;
	private JTextField textFieldPseudo1;
	private JTextField textFieldPseudo2;
	private JTextField textFieldPseudo3;
	private JButton btnLancer;
	private JTextField textFieldPseudo4;
	private JLabel lblJoueur1;
	private JLabel lblJoueur2;
	private JLabel lblJoueur3;
	private JLabel lblJoueur4;
	private JLabel lblAffichage1;
	private JLabel lblAffichage2;
	private JLabel lblAffichage3;
	private JLabel lblAffichage4;

	public void init_fenetre() {
	        this.width = 1200;
	        this.height = 720;
	    }

	    public void fenetre_menu() throws IOException {

	        this.frame = new JFrame("MENU PRINCIPAL");

	        JButton b1 = new JButton("Jouer");
	        JButton b2 = new JButton("Regles du jeu");
	        JButton b3 = new JButton("Crédits");

			BufferedImage bufferedImage = ImageIO.read(new File("Images/backgroundmenu.png"));
			Image image = bufferedImage.getScaledInstance(1200, 720, Image.SCALE_DEFAULT);

			ImageIcon icon = new ImageIcon(image);

			JLabel jLabel = new JLabel();
			jLabel.setIcon(icon);
	        this.frame.add(jLabel);

	        b1.setBounds(500, 300, 200, 40);
			b1.addActionListener(this);
	        jLabel.add(b1);

	        b2.setBounds(500, 400 , 200, 40);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					frame.setVisible(false);
					//Imageslider i = new Imageslider();
					try {
						fenetre_regles_generales();
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				}
			});

			jLabel.add(b2);

	        b3.setBounds(500, 500, 200, 40);
	        jLabel.add(b3);

	        this.frame.setResizable(false);
	        this.frame.setSize(1200, 720);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);
	    }

	    public void fenetre_regles() {

	        this.frame = new JFrame("REGLES DU JEU");

	        JLabel image = new JLabel(new ImageIcon("Images/backgroundregle.png"));

	        JButton b1 = new JButton("Règles générale");
	        JButton b2 = new JButton("Règles pièces");

	        Icon icon = new ImageIcon(
	                new ImageIcon("Imagees/fleche.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	        JButton b3 = new JButton(icon);

	        // Récupère l'image source
	        Image imgS = Toolkit.getDefaultToolkit().createImage("Images/PiècePNG.png");

	        // récupération du coin haut gauche x=0,y=0,w=100,h=100 image[0][0]
	        Icon Image1 = new ImageIcon(Toolkit.getDefaultToolkit()
	                .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(0, 0, 100, 100))));
	        JButton b4 = new JButton(Image1);

	        // récupération de l'image[1][0]
	        Icon Image2 = new ImageIcon(Toolkit.getDefaultToolkit()
	                .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(200, 0, 100, 100))));
	        JButton b5 = new JButton(Image2);

	        image.setBounds(0, 0, 850, 600);
	        this.frame.add(image);



	        b1.setBounds(200, 100, 200, 40);
	        image.add(b1);

	        b2.setBounds(200, 200, 200, 40);
	        image.add(b2);

	        b3.setBounds(200, 300, 200, 40);
	        image.add(b3);

	        b4.setBounds(200, 400, 200, 40);
	        image.add(b4);

	        b5.setBounds(200, 500, 200, 40);
	        image.add(b5);

	        this.frame.setResizable(false);
	        this.frame.setSize(1200, 750);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);
	    }

	    public void fenetre_regles_generales() throws IOException {

	        this.frame = new JFrame("REGLES DU JEU");

	        JLabel image = new JLabel(new ImageIcon("Images/backgroundregle.png"));

			BufferedImage bufferedImage = ImageIO.read(new File("Images/backgroundregle.png"));
			Image image2 = bufferedImage.getScaledInstance(1200, 720, Image.SCALE_DEFAULT);

			ImageIcon icon = new ImageIcon(image2);

			JLabel jLabel = new JLabel();
			jLabel.setIcon(icon);
			this.frame.add(jLabel);

	        JButton b1 = new JButton("Règles générale");

			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					frame.setVisible(false);
					Imageslider i = new Imageslider();
				}
			});

			JButton b2 = new JButton("Règles pièces");
	        JButton b3 = new JButton("Retour");

	        this.frame.add(jLabel);


	        b1.setBounds(500, 300, 200, 40);
	        jLabel.add(b1);

	        b2.setBounds(500, 400, 200, 40);
	        jLabel.add(b2);

	        b3.setBounds(500, 500, 200, 40);
	        jLabel.add(b3);

	        this.frame.setResizable(false);
	        this.frame.setSize(1200, 720);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);

	    }

	    public void fenetre_credits() {
	        this.frame.setTitle("CREDITS");

	        this.frame.setResizable(false);
	        this.frame.setSize(1200, 720);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);
	    }
 		public void fenetrePseudos() throws IOException {
			Fenetre menuJoueur = new Fenetre("MenuJoueur");
			JPanel panell = new JPanel();
			menuJoueur.setContentPane(panell);

			panell.setBorder(new EmptyBorder(5, 5, 5, 5));
			panell.setBackground(Color.lightGray);
			panell.setLayout(new BorderLayout(0, 0));
			panell.setLayout(null);

			BufferedImage bufferedImage = ImageIO.read(new File("Images/Joueurs.jpeg"));
			Image image3 = bufferedImage.getScaledInstance(1200, 720, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(image3);
			JLabel jLabel = new JLabel();
			jLabel.setIcon(icon);
			panell.add(jLabel);

			lblTitre = new JLabel("THE ISLAND");
			lblTitre.setForeground(Color.WHITE);
			lblTitre.setFont(new Font("Noteworthy", Font.PLAIN, 26));
			lblTitre.setBounds(350, 8, 299, 56);
			panell.add(lblTitre);

			rdbtn2 = new JRadioButton("2");
			rdbtn2.setActionCommand("2");
			rdbtn2.setForeground(Color.WHITE);
			rdbtn2.setBounds(200, 130, 40, 23);
			panell.add(rdbtn2);

			rdbtn4 = new JRadioButton("4");
			rdbtn4.setActionCommand("4");
			rdbtn4.setForeground(Color.WHITE);
			rdbtn4.setBounds(450, 130, 141, 23);
			panell.add(rdbtn4);

			ActionListener sliceActionListener = new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					AbstractButton aButton = (AbstractButton) actionEvent.getSource();
					System.out.println("Selected: " + aButton.getText());
					if(aButton.getText() == "4"){

					/**
					 ** Pseudo3 **
					 */
					textFieldPseudo3 = new JTextField();
					textFieldPseudo3.setColumns(10);
					textFieldPseudo3.setBounds(249, 334, 252, 36);
					panell.add(textFieldPseudo3);

					/**
					 ** Pseudo4 **
					 */
					textFieldPseudo4 = new JTextField();
					textFieldPseudo4.setColumns(10);
					textFieldPseudo4.setBounds(249, 395, 252, 36);
					panell.add(textFieldPseudo4);

					lblJoueur3 = new JLabel("Joueur 3 :");
					lblJoueur3.setBounds(113, 325, 60, 36);
					lblJoueur3.setForeground(Color.WHITE);
					panell.add(lblJoueur3);

					lblJoueur4 = new JLabel("Joueur 4 :");
					lblJoueur4.setBounds(111, 386, 60, 36);
					lblJoueur4.setForeground(Color.WHITE);
					panell.add(lblJoueur4);

					lblAffichage3 = new JLabel("");
					lblAffichage3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
					lblAffichage3.setForeground(Color.WHITE);
					lblAffichage3.setBounds(558, 336, 202, 15);
					panell.add(lblAffichage3);

					lblAffichage4 = new JLabel("");
					lblAffichage4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
					lblAffichage4.setForeground(Color.WHITE);
					lblAffichage4.setBounds(558, 397, 202, 15);
					panell.add(lblAffichage4);
					}
				}
			};

			rdbtn2.addActionListener(sliceActionListener);
			rdbtn4.addActionListener(sliceActionListener);
			//rdbtn2.setSelected(true);

			lblNombreJoueur = new JLabel("Choisissez le nombre de joueurs :");
			lblNombreJoueur.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			lblNombreJoueur.setForeground(Color.WHITE);
			lblNombreJoueur.setBounds(35, 60, 300, 60);
			panell.add(lblNombreJoueur);

			lblPseudo = new JLabel("Saissez vos pseudos joueurs :");
			lblPseudo.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			lblPseudo.setForeground(Color.WHITE);
			lblPseudo.setBounds(35, 160, 262, 40);
			panell.add(lblPseudo);

			/**
			 ** Pseudo1 **
			 */
			textFieldPseudo1 = new JTextField();
			textFieldPseudo1.setColumns(10); //On lui donne un nombre de colonnes à afficher
			textFieldPseudo1.setBounds(249, 210, 252, 36);
			panell.add(textFieldPseudo1);

			/**
			 ** Pseudo2 **
			 */
			textFieldPseudo2 = new JTextField();
			textFieldPseudo2.setColumns(10);
			textFieldPseudo2.setBounds(249, 268, 252, 36);
			panell.add(textFieldPseudo2);

			/**
			 ** Pseudo3 **

			textFieldPseudo3 = new JTextField();
			textFieldPseudo3.setColumns(10);
			textFieldPseudo3.setBounds(249, 334, 252, 36);
			panell.add(textFieldPseudo3);

			/**
			 ** Pseudo4 **

			textFieldPseudo4 = new JTextField();
			textFieldPseudo4.setColumns(10);
			textFieldPseudo4.setBounds(249, 395, 252, 36);
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
/*
			lblJoueur3 = new JLabel("Joueur 3 :");
			lblJoueur3.setBounds(113, 325, 60, 36);
			lblJoueur3.setForeground(Color.WHITE);
			panell.add(lblJoueur3);

			lblJoueur4 = new JLabel("Joueur 4 :");
			lblJoueur4.setBounds(111, 386, 60, 36);
			lblJoueur4.setForeground(Color.WHITE);
			panell.add(lblJoueur4);
*/
			lblAffichage1 = new JLabel("");
			lblAffichage1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			lblAffichage1.setForeground(Color.WHITE);
			lblAffichage1.setBounds(558, 214, 202, 15);
			panell.add(lblAffichage1);

			lblAffichage2 = new JLabel("");
			lblAffichage2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			lblAffichage2.setForeground(Color.WHITE);
			lblAffichage2.setBounds(558, 272, 202, 15);
			panell.add(lblAffichage2);
/*
			lblAffichage3 = new JLabel("");
			lblAffichage3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			lblAffichage3.setForeground(Color.WHITE);
			lblAffichage3.setBounds(558, 336, 202, 15);
			panell.add(lblAffichage3);

			lblAffichage4 = new JLabel("");
			lblAffichage4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			lblAffichage4.setForeground(Color.WHITE);
			lblAffichage4.setBounds(558, 397, 202, 15);
			panell.add(lblAffichage4);
*/
/*
            textFieldPseudo1.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkBtn();
                }
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkBtn();
                }
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkBtn();
                }
            });
            btnLancer.setEnabled(false);
            add(textFieldPseudo1);
            add(btnLancer);
*/
			/**
			 ** Button Lancer Jeu & ActionEvent **
			 */
			btnLancer = new JButton(new GetAction(this,"Lancer le jeu"));

			btnLancer.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			btnLancer.setBackground(Color.BLUE);
			btnLancer.setForeground(Color.BLACK);
			btnLancer.setBounds(300, 480, 236, 56);
			panell.add(btnLancer);
			menuJoueur.setVisible(true);
		}

	public JTextField getTextFieldPseudo1(){
		return textFieldPseudo1;
	}

	public JTextField getTextFieldPseudo2(){
		return textFieldPseudo2;
	}
	public JTextField getTextFieldPseudo3(){
		return textFieldPseudo3;
	}
	public JTextField getTextFieldPseudo4(){
		return textFieldPseudo4;
	}

	public JLabel getLabelPseudo(){
		return lblAffichage1;
	}
	public JLabel getLabelPseudo2(){
		return lblAffichage2;
	}
	public JLabel getLabelPseudo3(){
		return lblAffichage3;
	}
	public JLabel getLabelPseudo4(){
		return lblAffichage4;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		FenetrePrincipale menu= new FenetrePrincipale();
		try {
			menu.fenetrePseudos(); //affiche la fenetre de saisie des pseudos
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		this.frame.setVisible(false); // ferme la fenetre du menu
	}
}

