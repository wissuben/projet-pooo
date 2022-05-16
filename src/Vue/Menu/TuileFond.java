package Vue.Menu;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.management.modelmbean.ModelMBean;

import Model.Tuile;
import Model.TuileEffet;
import Model.TypeTuile;

/**
 * <strong>TuileFond</strong>
 * <p>
 * Dessine les tuiles et attribue les images aux {@link Model.Tuile}
 * </p>
 *
 * @author Adrien Taberner
 */
public class TuileFond {
	
	 /**
 	 * Donne une {@link Image} à {@link Model.Tuile#Terrain}
 	 */
 	public static void setImageTerrain() {
	    	BufferedImage bufferedImage = null;
	    	Image foret = null, montagne = null, plage = null;
			try {
				bufferedImage = ImageIO.read(new File("Images/PiecePNG.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			foret = bufferedImage.getSubimage(200,200,100,100);
			montagne = bufferedImage.getSubimage(100,200,100,100);
			plage = bufferedImage.getSubimage(0,200,100,100);
			for(Tuile tuileTmp : Tuile.listeTuile) {
				if(tuileTmp.getTypeTuile() == TypeTuile.FORET) {
					tuileTmp.setTerrain(foret.getScaledInstance(91, 91, 0));
				}
				if(tuileTmp.getTypeTuile() == TypeTuile.MONTAGNE) {
					tuileTmp.setTerrain(montagne.getScaledInstance(91, 91, 0));
				}
				if(tuileTmp.getTypeTuile() == TypeTuile.PLAGE) {
					tuileTmp.setTerrain(plage.getScaledInstance(91, 91, 0));
				}
			}
		}
	    

	 /**
 	 * Affiche les tuiles.
 	 *
 	 * @param g2d le contexte pour dessiner.
 	 */
 	public static void afficherTuile(Graphics2D g2d) {
	    	for(Tuile tuileTmp : Tuile.listeTuile) {
	    		if(tuileTmp.getTypeTuile()!= TypeTuile.VIDE || tuileTmp.getTypeTuile()!= TypeTuile.ARRIVE) {
		    		if(tuileTmp.getTypeTuile() == TypeTuile.MER) {
		    			tuileTmp.setTerrain(null);
		    		}
		    		else if(tuileTmp.isFaceUp() == true){
			    		if( tuileTmp.getTypeTuile() == TypeTuile.FORET) {
			    			g2d.drawImage(tuileTmp.getTerrain(), tuileTmp.getHexagon().xpoints[0]-43, tuileTmp.getHexagon().ypoints[0]-7,null);
			    		}
			    		if(tuileTmp.getTypeTuile() ==TypeTuile.MONTAGNE) {
			    			g2d.drawImage(tuileTmp.getTerrain(), tuileTmp.getHexagon().xpoints[0]-45, tuileTmp.getHexagon().ypoints[0]-7,null);
			    		}
						if(tuileTmp.getTypeTuile() ==TypeTuile.PLAGE ) {
			    			g2d.drawImage(tuileTmp.getTerrain(), tuileTmp.getHexagon().xpoints[0]-47, tuileTmp.getHexagon().ypoints[0]-7,null);
						}
		    		}else {
		    			if(tuileTmp.getEffetTuile() == TuileEffet.BALEINE_ROUGE) {
		    				g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.BALEINE_VERT) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.SUPPRIME_BALEINE) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.BATEAU_VERT) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.BATEAU_ROUGE) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);						
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.DAUPHIN) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);						
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.SERPENT) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);						
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.REQUIN_ROUGE) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);						
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.REQUIN_VERT) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);					
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.SUPPRIME_REQUIN) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);						
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.TOURBILLON) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);					
						}
						if(tuileTmp.getEffetTuile() == TuileEffet.VOLCAN) {
							g2d.drawImage(tuileTmp.getEffet(),tuileTmp.getHexagon().xpoints[0]-49, tuileTmp.getHexagon().ypoints[0]-19,null);						
						}
		    		}
	    		}
	    	}
	 	}
	 
 	/**
 	 * Donne une {@link Image} à {@link Model.Tuile#Effet}.
 	 */
 	public static void setImageEffet() {
		 BufferedImage image = null;
		 	BufferedImage baleineRouge = null, baleineVert = null, supprimeBaleine = null,
	    		bateauVert = null, bateauRouge = null, dauphin = null,
	    		serpent = null, requinRouge = null, requinVert = null,
	    		supprimeRequin = null, tourbillon = null, volcan = null;
		 	Image baleineRougeI = null, baleineVertI = null, supprimeBaleineI = null,
		    		bateauVertI = null, bateauRougeI = null, dauphinI = null,
		    		serpentI = null, requinRougeI = null, requinVertI = null,
		    		supprimeRequinI = null, tourbillonI = null, volcanI = null;
	    	
			try {
				baleineRouge = ImageIO.read(new File("Images/Piece Baleine Rouge.png"));
				baleineVert = ImageIO.read(new File("Images/Piece Baleine Verte.png"));
				supprimeBaleine = ImageIO.read(new File("Images/Piece Baleine Rouge croix.png"));
				bateauVert = ImageIO.read(new File("Images/PièceBarque.png"));
				bateauRouge = ImageIO.read(new File("Images/PièceBarque rouge.png"));
				dauphin = ImageIO.read(new File("Images/PieceDauphin.png"));
				serpent = ImageIO.read(new File("Images/PieceDragon.png"));
				requinRouge = ImageIO.read(new File("Images/PieceRequin Rouge.png"));
				requinVert = ImageIO.read(new File("Images/PieceRequin vert.png"));
				supprimeRequin = ImageIO.read(new File("Images/PieceRequin Rouge croix.png"));
				tourbillon = ImageIO.read(new File("Images/PieceTyphon.png"));
				volcan = ImageIO.read(new File("Images/PieceVolcan.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			baleineRougeI = baleineRouge.getSubimage(100,100, 376, 376);
			baleineVertI = baleineVert.getSubimage(100,100, 376, 376) ;
			supprimeBaleineI = supprimeBaleine.getSubimage(100,100, 376, 376);
			bateauVertI = bateauVert.getSubimage(100,100, 376, 376) ;
			bateauRougeI = bateauRouge.getSubimage(100,100, 376, 376) ;
			dauphinI = dauphin.getSubimage(100,100, 376, 376) ;
			serpentI = serpent.getSubimage(100,100, 376, 376) ;
			requinRougeI = requinRouge.getSubimage(100,100, 376, 376) ;
			requinVertI = requinVert.getSubimage(100,100, 376, 376) ;
			supprimeRequinI = supprimeRequin.getSubimage(100,100, 376, 376) ;
			tourbillonI = tourbillon.getSubimage(100,100, 376, 376) ;
			volcanI = volcan.getSubimage(100,100, 376, 376);
			
			for(Tuile tuileTmp : Tuile.listeTuile) {
				if(tuileTmp.getTypeTuile()!= TypeTuile.VIDE || tuileTmp.getTypeTuile()!= TypeTuile.MER || tuileTmp.getTypeTuile()!= TypeTuile.ARRIVE) {
					if(tuileTmp.getEffetTuile() == TuileEffet.BALEINE_ROUGE) {
						tuileTmp.setEffet(baleineRougeI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.BALEINE_VERT) {
						tuileTmp.setEffet(baleineVertI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.SUPPRIME_BALEINE) {
						tuileTmp.setEffet(supprimeBaleineI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.BATEAU_VERT) {
						tuileTmp.setEffet(bateauVertI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.BATEAU_ROUGE) {
						tuileTmp.setEffet(bateauRougeI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.DAUPHIN) {
						tuileTmp.setEffet(dauphinI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.SERPENT) {
						tuileTmp.setEffet(serpentI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.REQUIN_ROUGE) {
						tuileTmp.setEffet(requinRougeI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.REQUIN_VERT) {
						tuileTmp.setEffet(requinVertI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.SUPPRIME_REQUIN) {
						tuileTmp.setEffet(supprimeRequinI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.TOURBILLON) {
						tuileTmp.setEffet(tourbillonI.getScaledInstance(100,100, 0));
					}
					if(tuileTmp.getEffetTuile() == TuileEffet.VOLCAN) {
						tuileTmp.setEffet(volcanI.getScaledInstance(100,100, 0));
					}
				}
			}
	 	}

}