package Controlleur;

import java.awt.FontFormatException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import Model.Explorateur;
import Model.Joueur;
import Model.Tuile;
import Model.TypeTuile;
import Vue.Plateau;

/**
 * <strong>La classe qui gère les cliques de la souris 
 * dans la phase de placement des explorateurs</strong>
 * <p>
 * Permet de gérer les cliques, implémente {@link MouseInputListener}.
 * </p>
 * @author Adrien Taberner
 * @see MouseEvent
 */
public class ExplorateurListener implements MouseInputListener {
	
	private JFrame source;
	/**Le joueur qui clique */
	private Joueur joueur;
	
	/**
	 * Instancie un nouveau Mouse Listener.
	 *
	 * @param main_frame la fenêtre principale.
	 * @param joueur Le joueur qui a cliqué.
	 */
	public ExplorateurListener(JFrame main_frame,Joueur joueur) {
		super();
		this.source = main_frame;
		this.joueur= joueur;
	}

	/**
	 * Fonction qui gère la clique pour placer un {@link Explorateur} sur le plateau.
	 * attribut à un pion {@link Explorateur} une case {@link Tuile}.
	 * @param e l'evenement crée {@link MouseEvent}
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		int index = joueur.listeJoueur.indexOf(joueur);
		for (Tuile tuileTmp : Tuile.listeTuile) {
			if (tuileTmp.getTypeTuile() != TypeTuile.VIDE || tuileTmp.getTypeTuile() != TypeTuile.MER || tuileTmp.getTypeTuile() != TypeTuile.ARRIVE) {
				if (tuileTmp.getHexagon() != null && tuileTmp.getHexagon().contains(e.getPoint())) {
					Explorateur explorateurTmp = joueur.getMainJoueur().explorateurAPlacer();
					if(joueur.placerExplorateur(tuileTmp,explorateurTmp) == true) {
						try {
							if(Joueur.indexTour==(Joueur.listeJoueur.size()-1)){
								Joueur.indexTour=0;
								joueur=Joueur.listeJoueur.get(Joueur.indexTour);
								Plateau.affichePlacementExplorateur(joueur);
							}else{
								Joueur.indexTour += 1;
								joueur=Joueur.listeJoueur.get(Joueur.indexTour);
								Plateau.affichePlacementExplorateur(joueur);
							}
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}	
			}
		}
		try {
			System.out.println(Plateau.Fond.getMouseMotionListeners());
			System.out.println(Plateau.Fond.getMouseListeners());
			if(TuileControlleur.phasePlacementTerminer()==true) {
				for(MouseListener ml : Plateau.Fond.getMouseListeners()) {
					Plateau.Fond.removeMouseListener(ml);
				}
				for(MouseMotionListener mml : Plateau.Fond.getMouseMotionListeners()) {
					Plateau.Fond.removeMouseMotionListener(mml);
				}
				Plateau.Fond.removeMouseMotionListener(Plateau.getMouseInputListener());
				Plateau.Fond.removeMouseListener(Plateau.getMouseInputListener());
				
				Plateau.afficherPlateau();
			}else {
				Plateau.affichePlacementExplorateur(joueur);
			} 
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Mouse pressed.
	 *
	 * @param e the e
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Mouse released.
	 *
	 * @param e the e
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Mouse entered.
	 *
	 * @param e the e
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	/**
	 * Mouse exited.
	 *
	 * @param e the e
	 */
	@Override
	public void mouseExited(MouseEvent e) {
	}

	/**
	 * Mouse dragged.
	 *
	 * @param e the e
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Quand la souris bouge met une case en surbrillance rouge.
	 *
	 * @param e l'evenement crée {@link MouseEvent}
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		for (Tuile tuileTmp : Tuile.listeTuile)  {
			if (tuileTmp.getHexagon() != null && tuileTmp.getHexagon().contains(e.getPoint())) {
				Plateau.setIndexTuileEvidence(tuileTmp.getIndex());
				try {
					joueur = Joueur.listeJoueur.get(Joueur.indexTour);
					Plateau.affichePlacementExplorateur(joueur);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
