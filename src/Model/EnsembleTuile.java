package Model; /**
 * Classe Model.EnsembleTuile.
 * un ensemble de tuiles à jouer
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */
import Model.Couleur;
import Model.Tuile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;

public class EnsembleTuile {
    private List<Tuile> tuile;

    public EnsembleTuile(){
        tuile= new ArrayList<Tuile>();
        for(Couleur couleur : Couleur.values()){
            for (TypeTuile typeTuile : TypeTuile.values()){
                System.out.println("création de tuiles ["+couleur+"]["+typeTuile+"]");
                tuile.add(new Tuile(couleur,typeTuile));
            }
        }
        shuffle();// pour mélanger les tuiles
    }

    private void shuffle() {
        Random random= new Random();
        for(int i = 0; i<tuile.size();i++){
            Collections.swap(tuile, i, random.nextInt(tuile.size()));
        }
    }
}
