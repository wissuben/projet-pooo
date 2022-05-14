package Model;

import java.util.ArrayList;
import java.util.Random;

import javax.management.modelmbean.ModelMBean;

/**
 * <strong>Enum TypeTuile </strong>
 * <p>
 * Représente le type de la {@link Model.Tuile}. 
 * </p>
 *
 * @author Adrien Taberner
 */
public enum TypeTuile {
    
    FORET,
    MONTAGNE,
    PLAGE,
    MER,
    VIDE,
    ARRIVE;

	/**
	 * <p>
	 * Crée une liste de {@link Model.TypeTuile} pour les tuiles.
	 * </p>
	 * @return Une liste aléatoire de {@link Model.TypeTuile}.
	 */
	public static ArrayList<TypeTuile> getRandomTuiles() {
		ArrayList<TypeTuile> randomTuiles = new ArrayList<TypeTuile>();
		int
		NombrePlage = 16,
		NombreForet = 16,
		NombreMontagne = 8,
		randInt=0;
		do {
			Random randomGenerator = new Random();
			randInt = randomGenerator.nextInt(1,4);
			if(randInt == 1 && NombrePlage > 0) {
				NombrePlage--;
				randomTuiles.add(TypeTuile.PLAGE);
			}
			if(randInt == 2 && NombreForet > 0) {
				NombreForet--;
				randomTuiles.add(TypeTuile.FORET);
			}
			if(randInt == 3 && NombreMontagne > 0) {
				NombreMontagne--;
				randomTuiles.add(TypeTuile.MONTAGNE);
			}
		}while(NombreForet>0 || NombreMontagne > 0 || NombrePlage > 0);
		return randomTuiles;
	}
}