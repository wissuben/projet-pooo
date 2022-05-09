package Model;

import java.util.ArrayList;
import java.util.List;

public class Bateau {
	/* il faut qu'on herite de ces caracteristique là.*/ 
	public int PositionX;
	public int PositionY;
	/**************************************************/
	private List<Explorateur> passager = new ArrayList<Explorateur>();
	
    public Bateau() {
    }
    
    public void couler() {
        // TODO implement here
    }

    public void getNBExplorateur() {
        // TODO implement here
    }

    public void RecupererExplorateur(Explorateur explorateur) {
    	if(passager.size() < 3 ) {
    		passager.add(explorateur);
    	}
    }

}