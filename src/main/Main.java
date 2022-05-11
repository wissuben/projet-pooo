package main;

import java.awt.EventQueue;
import java.awt.Polygon;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import Model.Plateau;
import Model.Tuile;
import Vue.Menu.Fenetre;
import Vue.Menu.FenetrePrincipale;

public class Main {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					FenetrePrincipale menu = new FenetrePrincipale();
					menu.init_fenetre();
					menu.fenetre_regles();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() throws IOException {
		initialize();
		Tuile.initTuiles();
		Plateau.screenRender(frame);
		Tuile.setHexagone();
		Tuile.setTerrain();
		Tuile.initVoisin();
		for (Tuile tuile : Tuile.listeTuile) {
			System.out.println("x:"+tuile.PositionX + "  y:" +tuile.PositionY +"  index:"+tuile.getIndex() + "  type:"+ tuile.getTypeTuile() +  "	polygone :" + tuile.getHexagon() + "	Voisin : " + tuile.getVoisin());
		}
		System.out.printf("\n  %d \n",Plateau.listHexagone.size());
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1200,720);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
