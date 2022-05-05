/**
 * Classe Explorateur.
 * Pour
 *
 * @version 1.0
 *
 * @seeUneAutreClasse
 * @author Oumaima HAIMAR.
 */
public class Explorateur {
    private int valeur;
    private Couleur couleur;

    public Explorateur(int valeur, Couleur couleur){
        super();
        this.valeur=valeur;
        this.couleur = couleur;
    }
    public Couleur getCouleur(){
        return couleur;
    }

    public int getValeur(){
        return valeur;
    }
}
