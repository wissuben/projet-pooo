package Model;

import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class MouseListener implements MouseInputListener{

	private JFrame source;
	public MouseListener(JFrame source) {
		super();
		this.source = source;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		for(Tuile tuileTmp : Tuile.listeTuile) {
			if (tuileTmp.getTypeTuile() != TypeTuile.VIDE || tuileTmp.getTypeTuile() != TypeTuile.MER || tuileTmp.getTypeTuile() != TypeTuile.ARRIVE){
				if(tuileTmp.getHexagon()!= null) {
					if(tuileTmp.getHexagon().contains(e.getPoint())) {
						Tuile.RetirerTuile(tuileTmp.getIndex());
						tuileTmp.setTypeTuile(TypeTuile.MER);
						try {
							Plateau.screenRender(source);
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
