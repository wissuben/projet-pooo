/**
 * Classe Joueur.
 * Pour
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */
import javax.swing.*;

public class Joueur {
    private String nom;
    private MainJoueur mainJoueur;

    public Joueur(String nom){
        super();
        this.nom=nom;
        mainJoueur = new MainJoueur();
    }

    public EnsembleTuile getTuile(int index){
        return  mainJoueur.getTuile(index);
    }
    public EnsembleTuile retirerTuile(){
        return mainJoueur.retirerTuile();
    }
}
