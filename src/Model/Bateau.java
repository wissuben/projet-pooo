package Model;

import java.util.ArrayList;
import java.util.List;

public class Bateau extends Piece{
	private List<Explorateur> passager = new ArrayList<Explorateur>();
	
    public Bateau(int posX ,int PosY) {
    	this.PositionX = posX;
    	this.PositionY = PosY;
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