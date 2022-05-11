package Model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;
import javax.management.modelmbean.ModelMBean;
import javax.swing.ImageIcon;

import Model.Piece;

public class Tuile extends Piece {
	
	public static ArrayList<Tuile> listeTuile = new ArrayList<Tuile>();
	private static int[][] tuliesTab;
    private List<Tuile> voisin = new ArrayList<Tuile>();

	private CouleurTuile couleur;
    private TypeTuile typeTuile;
    private TuileEffet effetTuile;
	private boolean faceUp;
	private int index;
	private Polygon hexagon = null;
	private Image Terrain;


	public Tuile(int posX,int posY, int index) {
    	this.PositionX = posX;
    	this.PositionY = posY;
    	this.index = index;
    }


    public static void initTuiles() {	//Permet a chaque Tuile d'avoir un typeTuile
		ArrayList<TypeTuile> randomTypeTuiles = TypeTuile.getRandomTuiles();
    	Tuile.initTabTuiles();
    	int posX = 0,posY = 0;
    	int  k = 0;
    	for(Tuile tuileTmp : Tuile.listeTuile) {
    		tuileTmp.setFaceUp(true);
    		posX = tuileTmp.PositionX;
    		posY = tuileTmp.PositionY;
    		if (posY == 0){
    			if(posX <= 4) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 4 && posX <= 18) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 18) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if (posY == 1){
    			if(posX <= 3) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 3 && posX <= 19) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 19) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if (posY == 2){
    			if(posX <= 2) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 2 && posX <= 22) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 22) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if(posY ==  3) {
    			if(posX <=1) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 1 && posX <=7) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 7  && posX <=15) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 15 && posX <= 21) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 21) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if ((posX == 3 && posY == 1) || (posX == 2 && posY == 2) || (posX == 21 && posY == 1) || (posX == 22 && posY == 2)  ) {
    			tuileTmp.typeTuile = TypeTuile.ARRIVE;
    		}
    		if(posY ==  4) {
    			if(posX == 0) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 0 && posX <=6) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 6  && posX <=16) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 16 && posX <=22) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 22) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if(posY ==  5) {
    			if(posX <=3) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 3  && posX <=19) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 19 && posX <= 23) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 23) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if(posY ==  6) {
    			if(posX < 2) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX >= 2 && posX <= 4) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 4  && posX <=10) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX == 12) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 12  && posX <= 18) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 18 && posX <= 22) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 22) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if(posY ==  7) {
    			if(posX <=3) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 3  && posX <=19) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 19 && posX <= 23) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 23) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if(posY ==  8) {
    			if(posX == 0) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 0 && posX <=6) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 6  && posX <=16) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 16 && posX <=22) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 22) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if(posY ==  9) {
    			if(posX <=1) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 1 && posX <=7) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 7  && posX <=15) {
    				tuileTmp.typeTuile = randomTypeTuiles.get(k);
    				k+=1;
    			}
    			if(posX > 15 && posX <= 21) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 21) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if (posY == 10){
    			if(posX <= 2) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 2 && posX <= 22) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 22) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if (posY == 11){
    			if(posX <= 3) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 3 && posX <= 19) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 19) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if (posY == 12){
    			if(posX <= 4) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    			if(posX > 4 && posX <= 18) {
    				tuileTmp.typeTuile = TypeTuile.MER;
    			}
    			if(posX > 18) {
    				tuileTmp.typeTuile = TypeTuile.VIDE;
    			}
    		}
    		if ((posX == 3 && posY == 11) || (posX == 2 && posY == 10) || (posX == 21 && posY == 11) || (posX == 22 && posY == 10)  ) {
    			tuileTmp.typeTuile = TypeTuile.ARRIVE;
    		}
    	}
    }
    
    public static void setHexagone() {	// Permet au hexagone non vide d'avoir leurs coordonnées
    	int k=0;
    	Plateau.initHexagon();
    	for(Tuile tuileTmp : listeTuile) {
    		if(tuileTmp.typeTuile != TypeTuile.VIDE) {
    			tuileTmp.hexagon = Plateau.listHexagone.get(k);
    			k++;
    		}
    	}
    }
    
    public static void initTabTuiles() { 	//Créé un tableau pour positionner les hexagone
    	int i=0,j=0;
    	int index = 0;
    	tuliesTab = new int[13][26];
    	for (j=0;j<13;j++) {
    		for(i=0;i<26;i+=2) {
    			if (j%2 == 0) {
    				tuliesTab[j][i]=i;
    				tuliesTab[j][i+1]=i+1;
    				listeTuile.add(new Tuile(i, j, index));
    				
    			}
    			if (j%2 == 1) {
        			tuliesTab[j][i]=i;
        			tuliesTab[j][i+1]=i+1;
        			listeTuile.add(new Tuile(i+1, j, index));
        		}
    			index += 1;
    		}
    	}
    }
    
    public static void setTerrain() {	// Donne une image terrain au tuiles
    	BufferedImage bufferedImage = null;
    	Image foret =null,montagne = null, plage=null;
		try {
			bufferedImage = ImageIO.read(new File("Images/PiecePNG.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		foret = bufferedImage.getSubimage(200,200,100,100);
		montagne = bufferedImage.getSubimage(100,200,100,100);
		plage = bufferedImage.getSubimage(0,200,100,100);
		for(Tuile tuileTmp : listeTuile) {
			if(tuileTmp.typeTuile == TypeTuile.FORET) {
				tuileTmp.Terrain = foret.getScaledInstance(74, 74, 0);
			}
			if(tuileTmp.typeTuile == TypeTuile.MONTAGNE) {
				tuileTmp.Terrain = montagne.getScaledInstance(75, 74, 0);
			}
			if(tuileTmp.typeTuile == TypeTuile.PLAGE) {
				tuileTmp.Terrain = plage.getScaledInstance(75, 74, 0);
			}
		}
		//Image image = bufferedImage.getScaledInstance((Plateau.imageX),(Plateau.imageY), Image.SCALE_SMOOTH);
	}
    
    public static void afficherTuile(Graphics2D g2d) {
    	for(Tuile tuileTmp : listeTuile) {
    		if( tuileTmp.getTypeTuile() == TypeTuile.FORET) {
    			g2d.drawImage(tuileTmp.getTerrain(), tuileTmp.getHexagon().xpoints[0]-35, tuileTmp.getHexagon().ypoints[0]-5,null);
    		}
    		if(tuileTmp.getTypeTuile() ==TypeTuile.MONTAGNE) {
    			g2d.drawImage(tuileTmp.getTerrain(), tuileTmp.getHexagon().xpoints[0]-37, tuileTmp.getHexagon().ypoints[0]-5,null);
    		}
			if(tuileTmp.getTypeTuile() ==TypeTuile.PLAGE ) {
    			g2d.drawImage(tuileTmp.getTerrain(), tuileTmp.getHexagon().xpoints[0]-38, tuileTmp.getHexagon().ypoints[0]-5,null);
			}
    	}
    }

    public static void initVoisin() {
		int posX,posY;
    	for(Tuile tuileTmp : listeTuile) {
			posX = tuileTmp.PositionX;
			posY = tuileTmp.PositionY;
			if( posY==0 ) {
				if(posX==0) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
				if(posX > 0 && posX < 24) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
				if(posX == 24) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
			}
			if( (posY%2) == 0 && (posY<12) && (posY>0)) {
				if(posX==0) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
				if(posX>0 && posX < 24) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
				if(posX==24) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
			}
			if( (posY%2) == 1) {
				if(posX==1) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
				if(posX>1 && posX < 25) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY+1)));
				}
				if(posX==25) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY+1)));
				}
			}
			if( posY==12 ) {
				if(posX==0) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
				}
				if(posX > 0 && posX < 24) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,0)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+2,0)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
				}
				if(posX == 24) {
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-2,posY)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX-1,posY-1)));
					tuileTmp.voisin.add(Tuile.listeTuile.get(Tuile.getIndex(posX+1,posY-1)));
				}
			}
		}
	}
    
    private static int getIndex(int posX,int posY) {
    	for(Tuile tuileTmp : listeTuile) {
    		if(tuileTmp.PositionX == posX && tuileTmp.PositionY == posY) {
    			return tuileTmp.index;
    		}
    	}
    	return 0 ;
	}
    
	public Image getTerrain() {
		return Terrain;
	}
	
    public Polygon getHexagon() {
		return hexagon;
	}

    public int getIndex() {
		return index;
	}
    
    public TypeTuile getTypeTuile() {
		return typeTuile;
    }
    
    public static int[][] getTuliesTab() {
		return tuliesTab;
	}
    
    public List<Tuile> getVoisin() {
		return voisin;
	}
    
    public static void RetirerTuile(int index) {
        Tuile tuileTmp;
    	tuileTmp = listeTuile.get(index);
    	if(tuileTmp.typeTuile != TypeTuile.VIDE) {
    		tuileTmp.typeTuile = TypeTuile.MER;
    		listeTuile.set(index, tuileTmp);
    	}
    }


	public boolean isFaceUp() {
		return faceUp;
	}


	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}

}
