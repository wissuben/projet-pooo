package Model;

import Model.Couleur;

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
    private Couleur couleur;
    private TypeTuile typeTuile;
    private boolean faceUp;

    public Tuile(Couleur couleur, TypeTuile typeTuile){
        super();
        this.couleur = couleur;
        this.typeTuile=typeTuile;
    }
    public Couleur getCouleur(){
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
