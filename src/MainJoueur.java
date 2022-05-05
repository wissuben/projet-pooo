/**
 * Classe MainJoueur.
 * Pour
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */
import main.Main;

import java.util.ArrayList;
import java.util.List;

public class MainJoueur {
    private List<EnsembleTuile>tuiles;

    public MainJoueur(){
        tuiles=new ArrayList<EnsembleTuile>();
    }

    public void addTuile(EnsembleTuile tl){
        tuiles.add(tl);
    }

    public EnsembleTuile getTuile(int index){
        return  tuiles.get(index);
    }
    public EnsembleTuile retirerTuile(){
        return tuiles.remove(0);
    }
}
