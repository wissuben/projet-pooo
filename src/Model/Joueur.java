 /**
 * Classe Model.Joueur.
 * un nom et une main
 *
 * @version 1.0
 *
 * @seeUneAutreClasse
 * @author Oumaima HAIMAR.
 */
package Model;
public class Joueur {
    private String nom;
    private MainJoueur mainJoueur;

    public Joueur(String nom){
        super();
        this.nom=nom;
        mainJoueur = new MainJoueur();
    }

    public Piece getTuile(int index){
        return  mainJoueur.getTuile(index);
    }
    public Piece retirerTuile(){
        return mainJoueur.retirerTuile();
    }
}
