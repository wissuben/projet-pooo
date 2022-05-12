package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import Controlleur.MouseListener;
import Vue.Menu.TuileFond;

public class Plateau extends JFrame{
	public static ArrayList<Polygon> listHexagone = new ArrayList<Polygon>();
	static int
	posX = 0,
	posY = 0,
	imageX = (int)((int)1200/1.3),
	imageY = (int)((int)720/1.04);
	
	public static void initPlateau() {
		Plateau.initHexagon();
	}
	
	public static void screenRender(JFrame main_frame) throws IOException  {;
		JPanel fond = new DrawPlateau();
		fond.addMouseListener(new MouseListener(main_frame));
		main_frame.add(fond);
		main_frame.setVisible(true); 
	}
	
	public static void initHexagon(){
		int i,j;
		int ligne[] = {7,10,11,10,11,12,11,12,11,10,11,10,7};
		int positionCorrect[] = {9,11,11,11,12,12,12,12,11,11,11,9,11};
		int colonne = 13;
		int Xhexagon[] = {25,50,50,25,0,0}; 
		int Yhexagon[] = {0,14,43,57,43,14};
		Polygon hexagon = new Polygon(Xhexagon,Yhexagon,6);
		hexagon.translate(Plateau.posX + 290,Plateau.posY + 60);
		for (j = 0; j < colonne; j++) {
			for (i = 0; i < ligne[j]; i++) {
				Plateau.listHexagone.add(new Polygon(hexagon.xpoints, hexagon.ypoints, 6));
				hexagon.translate(50,0);
			}
			hexagon.translate(-50*positionCorrect[j],0);
			hexagon.translate(25,43);
		}
	}	
}


class DrawPlateau extends JPanel{		//Permet de dessiner les hexagone et leur terrain
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int i,j,k,l;
		int ligne[] = {7,10,11,10,11,12,11,12,11,10,11,10,7};
		int colonne = 13;
		int[] ligneX;
		int[] ligneY;
		BasicStroke stroke = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
		BasicStroke separation = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
		Polygon hexagon = new Polygon();
		Tuile tuileTmp = null;
		Graphics2D g2d =(Graphics2D)g.create();
		
		BufferedImage bufferedImage = null;

		try {
			bufferedImage = ImageIO.read(new File("Images/MAPVide.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image image = bufferedImage.getSubimage(100, 0,1000,720);
		image = image.getScaledInstance((Plateau.imageX),(Plateau.imageY), Image.SCALE_SMOOTH);
		g2d.drawImage(image,Plateau.posX,Plateau.posY,null);
		g2d.setColor(Color.BLACK);
		
		k=0;
		l=0;
		for (j = 0; j < colonne; j++) {
			for (i = 0; i < ligne[j]; i++) {
				hexagon = Plateau.listHexagone.get(k);
				g2d.setStroke(stroke);
				g2d.drawPolygon(hexagon);
				k+=1;
				g2d.setStroke(separation);
				if (i>= 3 && i <= 6 && j == 3) {
					ligneX = new int[] {hexagon.xpoints[5],hexagon.xpoints[0],hexagon.xpoints[1]};
					ligneY = new int[] {hexagon.ypoints[5],hexagon.ypoints[0],hexagon.ypoints[1]};
					if (i == 3) {
						ligneX = new int[] {hexagon.xpoints[4],hexagon.xpoints[5],hexagon.xpoints[0],hexagon.xpoints[1]};
						ligneY = new int[] {hexagon.ypoints[4],hexagon.ypoints[5],hexagon.ypoints[0],hexagon.ypoints[1]};
					}
					if (i == 6) {
						ligneX = new int[] {hexagon.xpoints[5],hexagon.xpoints[0],hexagon.xpoints[1],hexagon.xpoints[2]};
						ligneY = new int[] {hexagon.ypoints[5],hexagon.ypoints[0],hexagon.ypoints[1],hexagon.ypoints[2]};
					}
					g2d.drawPolyline(ligneX, ligneY,ligneX.length);
				}
				if (j == 4) {
					if (i==3) {
						ligneX = new int[] {hexagon.xpoints[4],hexagon.xpoints[5],hexagon.xpoints[0]};
						ligneY = new int[] {hexagon.ypoints[4],hexagon.ypoints[5],hexagon.ypoints[0]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if(i==7) {
						ligneX = new int[] {hexagon.xpoints[0],hexagon.xpoints[1],hexagon.xpoints[2]};
						ligneY = new int[] {hexagon.ypoints[0],hexagon.ypoints[1],hexagon.ypoints[2]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
				}
				if (j == 5 ) {
					if (i == 2) {
						ligneX = new int[] {hexagon.xpoints[3],hexagon.xpoints[4],hexagon.xpoints[5],hexagon.xpoints[0],hexagon.xpoints[1]};
						ligneY = new int[] {hexagon.ypoints[3],hexagon.ypoints[4],hexagon.ypoints[5],hexagon.ypoints[0],hexagon.ypoints[1]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 3) {
						ligneX = new int[] {hexagon.xpoints[5],hexagon.xpoints[0]};
						ligneY = new int[] {hexagon.ypoints[5],hexagon.ypoints[0]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 8) {
						ligneX = new int[] {hexagon.xpoints[0],hexagon.xpoints[1]};
						ligneY = new int[] {hexagon.ypoints[0],hexagon.ypoints[1]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 9) {
						ligneX = new int[] {hexagon.xpoints[5],hexagon.xpoints[0],hexagon.xpoints[1],hexagon.xpoints[2],hexagon.xpoints[3]};
						ligneY = new int[] {hexagon.ypoints[5],hexagon.ypoints[0],hexagon.ypoints[1],hexagon.ypoints[2],hexagon.ypoints[3]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
				}
				if ( j == 6) {
					if (i == 2) {
						ligneX = new int[] {hexagon.xpoints[4],hexagon.xpoints[5]};
						ligneY = new int[] {hexagon.ypoints[4],hexagon.ypoints[5]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 8) {
						ligneX = new int[] {hexagon.xpoints[1],hexagon.xpoints[2]};
						ligneY = new int[] {hexagon.ypoints[1],hexagon.ypoints[2]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
				}
				if (j == 7 ) {
					if (i == 2) {
						ligneX = new int[] {hexagon.xpoints[2],hexagon.xpoints[3],hexagon.xpoints[4],hexagon.xpoints[5],hexagon.xpoints[0]};
						ligneY = new int[] {hexagon.ypoints[2],hexagon.ypoints[3],hexagon.ypoints[4],hexagon.ypoints[5],hexagon.ypoints[0]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 3) {
						ligneX = new int[] {hexagon.xpoints[3],hexagon.xpoints[4]};
						ligneY = new int[] {hexagon.ypoints[3],hexagon.ypoints[4]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 8) {
						ligneX = new int[] {hexagon.xpoints[2],hexagon.xpoints[3]};
						ligneY = new int[] {hexagon.ypoints[2],hexagon.ypoints[3]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if (i == 9) {
						ligneX = new int[] {hexagon.xpoints[0],hexagon.xpoints[1],hexagon.xpoints[2],hexagon.xpoints[3],hexagon.xpoints[4]};
						ligneY = new int[] {hexagon.ypoints[0],hexagon.ypoints[1],hexagon.ypoints[2],hexagon.ypoints[3],hexagon.ypoints[4]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
				}
				if (j == 8) {
					if (i==3) {
						ligneX = new int[] {hexagon.xpoints[5],hexagon.xpoints[4],hexagon.xpoints[3]};
						ligneY = new int[] {hexagon.ypoints[5],hexagon.ypoints[4],hexagon.ypoints[3]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
					if(i==7) {
						ligneX = new int[] {hexagon.xpoints[1],hexagon.xpoints[2],hexagon.xpoints[3]};
						ligneY = new int[] {hexagon.ypoints[1],hexagon.ypoints[2],hexagon.ypoints[3]};
						g2d.drawPolyline(ligneX, ligneY, ligneX.length);
					}
				}
				if (i>= 3 && i <= 6 && j == 9) {
					ligneX = new int[] {hexagon.xpoints[2],hexagon.xpoints[3],hexagon.xpoints[4]};
					ligneY = new int[] {hexagon.ypoints[2],hexagon.ypoints[3],hexagon.ypoints[4]};
					if (i == 3) {
						ligneX = new int[] {hexagon.xpoints[2],hexagon.xpoints[3],hexagon.xpoints[4],hexagon.xpoints[5]};
						ligneY = new int[] {hexagon.ypoints[2],hexagon.ypoints[3],hexagon.ypoints[4],hexagon.ypoints[5]};
					}
					if (i == 6) {
						ligneX = new int[] {hexagon.xpoints[1],hexagon.xpoints[2],hexagon.xpoints[3],hexagon.xpoints[4]};
						ligneY = new int[] {hexagon.ypoints[1],hexagon.ypoints[2],hexagon.ypoints[3],hexagon.ypoints[4]};
					}
					g2d.drawPolyline(ligneX, ligneY,ligneX.length);
				}
			}
		}
		TuileFond.afficherTuile(g2d);
		g2d.dispose();
	}
}
