package Controlleur;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

import Model.Tuile;
import Model.TypeTuile;
import Vue.AideJoueur;
import Vue.Plateau;

/**
 * <strong>La classe qui gère les cliques de la souris dans la phase principale
 * de jeu</strong>
 * <p>
 * Permet de gérer les cliques, implémente {@link MouseInputListener}.
 * </p>
 * 
 * @author Adrien Taberner
 * @see MouseEvent
 */
public class PlateauListener implements MouseInputListener {

	private JButton source;

	/** Permets de savoir si on a retourné une tuile avant de la prendre */
	private static boolean tuileSelection = false;

	/**
	 * Instancie un nouveau Mouse Listener.
	 * 
	 * @param source une {@link JFrame}
	 */
	public PlateauListener(JButton source) {
		super();
		this.source = source;
	}

	/**
	 * Fonction qui gere le clique pour retouner une tuile.
	 *
	 * @param e l'evenement crée {@link MouseEvent}
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getComponent() == source) {
			if (AideJoueur.aideActive == false) {
				AideJoueur.aideActive = true;
				AideJoueur.init_aide();
				try {
					Plateau.afficherPlateau();
				} catch (IOException e1) {
				AideJoueur.index += 1;
				}
			}else{
				if (AideJoueur.index < 8) {
					try {
						Plateau.afficherPlateau();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					AideJoueur.index += 1;
				}else{
					AideJoueur.aideActive = false;
					AideJoueur.index = 0;
					try {
						Plateau.afficherPlateau();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		for (Tuile tuileTmp : Tuile.listeTuile) {
			if (tuileTmp.getTypeTuile() != TypeTuile.VIDE || tuileTmp.getTypeTuile() != TypeTuile.MER
					|| tuileTmp.getTypeTuile() != TypeTuile.ARRIVE) {
				if (tuileTmp.getHexagon() != null && tuileTmp.getHexagon().contains(e.getPoint())) {
					if (TuileControlleur.estRetournable(tuileTmp)) {
						if (tuileTmp.isFaceUp() == true && tuileSelection == false) {
							tuileTmp.setFaceUp(false);
							tuileSelection = true;
						} else if (tuileSelection == true && tuileTmp.isFaceUp() == false) {
							Tuile.RetirerTuile(tuileTmp.getIndex());
							tuileSelection = false;
						}
						try {
							Plateau.afficherPlateau();
							Plateau.afficherTuileInfo();
						} catch (IOException e1) {
							System.err.println("Immpossible d'afficher le nouveau plateau");
							e1.printStackTrace();
						}
					}
				}
			}
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
		// TODO Auto-generated method stub
	}

	/**
	 * Mouse exited.
	 *
	 * @param e the e
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

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
		for (Tuile tuileTmp : Tuile.listeTuile) {
			if (tuileTmp.getHexagon() != null && tuileTmp.getHexagon().contains(e.getPoint())) {
				Plateau.setIndexTuileEvidence(tuileTmp.getIndex());
				try {
					Plateau.afficherPlateau();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
