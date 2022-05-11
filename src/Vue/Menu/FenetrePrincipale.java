package Vue.Menu;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;

public class FenetrePrincipale {
	   	JFrame frame;
	    int width;
	    int height;

	    public void init_fenetre() {
	        this.width = 850;
	        this.height = 600;
	    }

	    public void fenetre_menu() {

	        this.frame = new JFrame("MENU PRINCIPAL");

	        JButton b1 = new JButton("Jouer");
	        JButton b2 = new JButton("Regles du jeu");
	        JButton b3 = new JButton("Crédits");

	        JLabel image = new JLabel(new ImageIcon("Images/backgroundmenu.png"));

	        image.setBounds(0, 0, 850, 600);
	        this.frame.add(image);

	        int decal = 50;
	        int x = (850 / 2 - 200 / 2);
	        int y = (600 / 2 - 40 / 2);

	        b1.setBounds(x, y, 200, 40);
	        image.add(b1);

	        b2.setBounds(x, y + decal, 200, 40);
	        image.add(b2);

	        b3.setBounds(x, y + 2 * decal, 200, 40);
	        image.add(b3);

	        this.frame.setResizable(false);
	        this.frame.setSize(this.width, this.height);
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

	        int decal = 50;
	        int x = (850 / 2 - 200 / 2);
	        int y = (500 / 2 - 40 / 2);

	        b1.setBounds(x, y, 200, 40);
	        image.add(b1);

	        b2.setBounds(x, y + decal, 200, 40);
	        image.add(b2);

	        b3.setBounds(20, 20, 50, 50);
	        image.add(b3);

	        b4.setBounds(100, 100, 100, 100);
	        image.add(b4);

	        b5.setBounds(300, 100, 100, 100);
	        image.add(b5);

	        this.frame.setResizable(false);
	        this.frame.setSize(this.width, this.height);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);

	    }

	    public void fenetre_regles_generales() {

	        this.frame = new JFrame("REGLES DU JEU");

	        JLabel image = new JLabel(new ImageIcon("Images/backgroundregle.png"));

	        JButton b1 = new JButton("Règles générale");
	        JButton b2 = new JButton("Règles pièces");
	        JButton b3 = new JButton("Retour");

	        image.setBounds(0, 0, 850, 600);
	        this.frame.add(image);

	        int decal = 50;
	        int x = (850 / 2 - 200 / 2);
	        int y = (500 / 2 - 40 / 2);

	        b1.setBounds(x, y, 200, 40);
	        image.add(b1);

	        b2.setBounds(x, y + decal, 200, 40);
	        image.add(b2);

	        b3.setBounds(10, 10, 100, 100);
	        image.add(b3);

	        this.frame.setResizable(false);
	        this.frame.setSize(this.width, this.height);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);

	    }

	    public void fenetre_credits() {
	        this.frame.setTitle("CREDITS");

	        this.frame.setResizable(false);
	        this.frame.setSize(this.width, this.height);
	        this.frame.setDefaultCloseOperation(3);
	        this.frame.setVisible(true);

	    }
	}

