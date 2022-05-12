package Model;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

public enum TuileEffet {
	BALEINE_ROUGE,
	REQUIN_ROUGE,
	BATEAU_ROUGE,
	BALEINE_VERT,
	REQUIN_VERT,
	BATEAU_VERT,
	DAUPHIN,
	SERPENT,
	SUPPRIME_REQUIN,
	SUPPRIME_BALEINE,
	TOURBILLON,
	VOLCAN;

	public static ArrayList<TuileEffet> getPlageEffet() {
		ArrayList<TuileEffet> randomTuiles = new ArrayList<TuileEffet>();
		HashMap<TuileEffet,Integer> tuileDisponible = new HashMap<TuileEffet,Integer>();
		int
		NombrePlage = 16,
		randInt=0;
		TuileEffet[] tuileEffetIndice = {DAUPHIN,BALEINE_ROUGE,REQUIN_ROUGE,BATEAU_ROUGE,BALEINE_VERT,
				REQUIN_VERT,BATEAU_VERT,SERPENT,SUPPRIME_REQUIN};
		tuileDisponible.put(BALEINE_VERT,3);
		tuileDisponible.put(REQUIN_VERT,3);
		tuileDisponible.put(BATEAU_VERT,1);
		tuileDisponible.put(BATEAU_ROUGE,2);
		tuileDisponible.put(DAUPHIN,3);
		tuileDisponible.put(SERPENT,1);
		tuileDisponible.put(REQUIN_ROUGE,1);
		tuileDisponible.put(BALEINE_ROUGE,1);
		tuileDisponible.put(SUPPRIME_REQUIN,1);
		
		do {
			Random randomGenerator = new Random();
			randInt = randomGenerator.nextInt(0,tuileDisponible.size());
			if(tuileDisponible.get(tuileEffetIndice[randInt]) > 0) {
				tuileDisponible.replace(tuileEffetIndice[randInt], tuileDisponible.get(tuileEffetIndice[randInt])-1);
				randomTuiles.add(tuileEffetIndice[randInt]);
				NombrePlage--;
			}
		}while(NombrePlage > 0);
		return randomTuiles;
	}
	public static ArrayList<TuileEffet> getForetEffet() {
		ArrayList<TuileEffet> randomTuiles = new ArrayList<TuileEffet>();
		HashMap<TuileEffet,Integer> tuileDisponible = new HashMap<TuileEffet,Integer>();
		int
		NombreForet = 16,
		randInt=0;
		TuileEffet[] tuileEffetIndice = {DAUPHIN,BALEINE_ROUGE,REQUIN_ROUGE,BALEINE_VERT,
				REQUIN_VERT,BATEAU_VERT,SERPENT,TOURBILLON,SUPPRIME_BALEINE,SUPPRIME_REQUIN};
		tuileDisponible.put(BALEINE_VERT,2);
		tuileDisponible.put(REQUIN_VERT,2);
		tuileDisponible.put(BATEAU_VERT,3);
		tuileDisponible.put(TOURBILLON,2);
		tuileDisponible.put(DAUPHIN,1);
		tuileDisponible.put(SERPENT,1);
		tuileDisponible.put(REQUIN_ROUGE,1);
		tuileDisponible.put(BALEINE_ROUGE,1);
		tuileDisponible.put(SUPPRIME_REQUIN,1);
		tuileDisponible.put(SUPPRIME_BALEINE,2);
		
		do {
			Random randomGenerator = new Random();
			randInt = randomGenerator.nextInt(0,tuileDisponible.size());
			if(tuileDisponible.get(tuileEffetIndice[randInt]) > 0) {
				tuileDisponible.replace(tuileEffetIndice[randInt], tuileDisponible.get(tuileEffetIndice[randInt])-1);
				randomTuiles.add(tuileEffetIndice[randInt]);
				NombreForet--;
			}
		}while(NombreForet > 0);
		return randomTuiles;
	}
	public static ArrayList<TuileEffet> getMontagneEffet() {
		ArrayList<TuileEffet> randomTuiles = new ArrayList<TuileEffet>();
		HashMap<TuileEffet,Integer> tuileDisponible = new HashMap<TuileEffet,Integer>();
		int
		NombreMontagne = 8,
		randInt=0;
		TuileEffet[] tuileEffetIndice = {REQUIN_VERT,VOLCAN,TOURBILLON,
				SUPPRIME_BALEINE,SUPPRIME_REQUIN};
		tuileDisponible.put(REQUIN_VERT,1);
		tuileDisponible.put(TOURBILLON,4);
		tuileDisponible.put(VOLCAN,1);
		tuileDisponible.put(SUPPRIME_REQUIN,1);
		tuileDisponible.put(SUPPRIME_BALEINE,1);
		
		do {
			Random randomGenerator = new Random();
			randInt = randomGenerator.nextInt(0,tuileDisponible.size());
			if(tuileDisponible.get(tuileEffetIndice[randInt]) > 0) {
				tuileDisponible.replace(tuileEffetIndice[randInt], tuileDisponible.get(tuileEffetIndice[randInt])-1);
				randomTuiles.add(tuileEffetIndice[randInt]);
				NombreMontagne--;
			}
		}while(NombreMontagne > 0);
		return randomTuiles;
	}
}
