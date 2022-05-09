package Model; /**
 * Classe Model.MainJoueur.
 * un ensemble de piece de jeu détenues par un joueur
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */

import java.util.ArrayList;
import java.util.List;

import Controlleur.RedimensionnerImage;

public class MainJoueur {
    private List<Piece>tuiles;
    private List<Explorateur>pionExplorateur;

    public MainJoueur(){
        tuiles=new ArrayList<Piece>();
    }

    public void addTuile(Piece tl){
        tuiles.add(tl);
    }

    public void initPionExporateur(CouleurExplorateur couleur) {
    	pionExplorateur = Explorateur.initJoueur_PionsExplorateur(couleur);
    }
    
    public Piece getTuile(int index){
        return  tuiles.get(index);
    }
    public Piece retirerTuile(){
        return tuiles.remove(0);
    }
}
