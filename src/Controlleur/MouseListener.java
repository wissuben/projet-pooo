package Controlleur;

import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import Model.Plateau;
import Model.Tuile;
import Model.TypeTuile;

public class MouseListener implements MouseInputListener {

	private JFrame source;

	public MouseListener(JFrame source) {
		super();
		this.source = source;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for (Tuile tuileTmp : Tuile.listeTuile) {
			if (tuileTmp.getTypeTuile() != TypeTuile.VIDE || tuileTmp.getTypeTuile() != TypeTuile.MER || tuileTmp.getTypeTuile() != TypeTuile.ARRIVE) {
				if (tuileTmp.getHexagon() != null && tuileTmp.getHexagon().contains(e.getPoint())) {
					if (TuileControlleur.estRetournable(tuileTmp)){
						if (tuileTmp.isFaceUp() == true) {
							tuileTmp.setFaceUp(false);
						}else {
							Tuile.RetirerTuile(tuileTmp.getIndex());
						}
						try {
							Plateau.afficherPlateau();
						} catch (IOException e1) {
							System.err.println("Immpossible d'afficher le nouveau plateau");
							e1.printStackTrace();
						}
					}
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
