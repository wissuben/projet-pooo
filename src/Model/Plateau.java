package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Plateau extends JFrame {
    static int
            posX = 150,
            posY = 0,
            imageX = 2816,
            imageY = 2112;


    public static void screenRender(JFrame main_frame) throws IOException  {
        LocalTime time = LocalTime.now();
        JPanel fond = new DrawHexagon();
        main_frame.add(fond);
        main_frame.setVisible(true);
        System.out.println((LocalTime.now().getNano()-time.getNano()));
    }
}


class DrawHexagon extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int i,j;
        int ligne[] = {7,10,11,10,11,12,11,12,11,10,11,10,7};
        int positionCorrect[] = {9,11,11,11,12,12,12,12,11,11,11,9,11};
        int colonne = 13;
        int[] ligneX;
        int[] ligneY;
        String tmp;
        int Xhexagon[] = {26,52,52,26,0,0};
        int Yhexagon[] = {0,14,44,58,44,14};
        BasicStroke stroke = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        BasicStroke separation = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        Polygon hexagon = new Polygon(Xhexagon,Yhexagon,6);
        Graphics2D g2d =(Graphics2D)g.create();
        BufferedImage bufferedImage = null;

        Plateau.imageX = (int)Plateau.imageX/(Plateau.imageY/g2d.getClipBounds().height);
        Plateau.imageY = g2d.getClipBounds().height;

        try {
            bufferedImage = ImageIO.read(new File("map1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image image = bufferedImage.getScaledInstance((Plateau.imageX),(Plateau.imageY), Image.SCALE_SMOOTH);

        g2d.drawImage(image,Plateau.posX,Plateau.posY,null);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(stroke);
        hexagon.translate(Plateau.posX + 220,Plateau.posY + 60);
        for (j = 0; j < colonne; j++) {
            for (i = 0; i < ligne[j]; i++) {
                hexagon.translate(52,0);
                g2d.setStroke(stroke);
                g2d.drawPolygon(hexagon);
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
            hexagon.translate(-52*positionCorrect[j],0);
            hexagon.translate(26,44);
        }
        g2d.dispose();
    }
}
