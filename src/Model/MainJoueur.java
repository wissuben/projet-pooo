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

public class MainJoueur {
    private List<Piece>tuiles;

    public MainJoueur(){
        tuiles=new ArrayList<Piece>();
    }

    public void addTuile(Piece tl){
        tuiles.add(tl);
    }

    public Piece getTuile(int index){
        return  tuiles.get(index);
    }
    public Piece retirerTuile(){
        return tuiles.remove(0);
    }
}
