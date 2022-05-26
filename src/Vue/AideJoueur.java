package Vue;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class AideJoueur {

    private static ArrayList<ImageIcon> AideJoueurListe = new ArrayList<>();
    public static boolean aideActive = false;
    public static int index = 0;
    
    public static void init_aide() {
        AideJoueurListe.add(new ImageIcon("Images/PageAide1.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide2.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide3.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide4.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide5.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide6.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide7.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide8.png"));
        AideJoueurListe.add(new ImageIcon("Images/PageAide9.png"));
    }

	public static ArrayList<ImageIcon> getAideJoueurListe() {
		return AideJoueurListe;
	}

	public static void setAideJoueurListe(ArrayList<ImageIcon> aideJoueurListe) {
		AideJoueurListe = aideJoueurListe;
	}
}