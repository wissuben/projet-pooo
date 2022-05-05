package Model;

import Model.CouleurTuile;

/**
 * Classe Model.Tuile.
 * une valeur, une couleur et un flag indiquant si la tuile est face visible ou cachée)
 *
 * @version 1.0
 *
 * @seeUneAutreClasse
 * @author Oumaima HAIMAR.
 */
public class Tuile {
    private CouleurTuile couleur;
    private TypeTuile typeTuile;
    private boolean faceUp;

    public Tuile(CouleurTuile couleur, TypeTuile typeTuile){
        super();
        this.couleur = couleur;
        this.typeTuile=typeTuile;
    }
    public CouleurTuile getCouleur(){
        return couleur;
    }

    public TypeTuile getTypeTuile(){
        return typeTuile;
    }
    public boolean isFaceUp(){
        faceUp = !faceUp;
        return faceUp;
    }
}
