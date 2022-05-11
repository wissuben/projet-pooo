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
			REQUIN_VERT,BATEAU_VERT,SERPENT,SUPPRIME_BALEINE};
	tuileDisponible.put(BALEINE_VERT,3);
	tuileDisponible.put(REQUIN_VERT,3);
	tuileDisponible.put(BATEAU_VERT,1);
	tuileDisponible.put(BATEAU_ROUGE,2);
	tuileDisponible.put(DAUPHIN,3);
	tuileDisponible.put(SERPENT,1);
	tuileDisponible.put(REQUIN_ROUGE,1);
	tuileDisponible.put(BALEINE_ROUGE,1);
	tuileDisponible.put(SUPPRIME_BALEINE,1);
	
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
}
