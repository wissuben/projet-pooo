package Model;

import Model.CouleurExplorateur;

/**
 * Classe Model.Explorateur.
 * Pour
 *
 * @version 1.0
 *
 * @seeUneAutreClasse
 * @author Oumaima HAIMAR.
 */
public class Explorateur {
    private int valeur;
    private CouleurExplorateur couleur;

    public Explorateur(int valeur, CouleurExplorateur couleur){
        super();
        this.valeur=valeur;
        this.couleur = couleur;
    }
    public CouleurExplorateur getCouleur(){
        return couleur;
    }

    public int getValeur(){
        return valeur;
    }
}
