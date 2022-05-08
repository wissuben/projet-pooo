 /**
 * Classe Model.EnsembleTuile.
 * un ensemble de tuiles à jouer
 *
 * @version 1.0
 *
 * @see UneAutreClasse
 * @author Oumaima HAIMAR.
 */
package Model;
import Controlleur.RedimensionnerImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;

public class Piece {
    private List<Tuile> tuile;
    private List<Explorateur> explorateur;
    /**
     ** Création de pièces
     */
    public Piece() throws IOException {
        /**
         ** Création de Tuiles
         */
        JFrame Explorateur = new JFrame("Afficher explorateur");
        tuile= new ArrayList<Tuile>();
        for(CouleurTuile couleur : CouleurTuile.values()){
            for (TypeTuile typeTuile : TypeTuile.values()){
                System.out.println("création de tuiles ["+couleur+"]["+typeTuile+"]");
                tuile.add(new Tuile(couleur,typeTuile));
            }
        }
        /**
         ** Création d'explorateur
         */
        System.out.println("Création d'explorateur :");
        explorateur= new ArrayList<Explorateur>();
        for(CouleurExplorateur couleur : CouleurExplorateur.values()){
            for (int i=1;i<7;i++){
                /**
                 ** 3 exemplaires de 1
                 */
                if(i==1){
                    for(int j=1;j<3;j++){
                        System.out.println("création d'explorateur ["+couleur+"]["+i+"]");
                        explorateur.add(new Explorateur(i,couleur));

                    }
                }
                /**
                 ** 2 exemplaires de 2
                 */
                if(i==2){
                    for(int j=1;j<2;j++){
                        System.out.println("création d'explorateur ["+couleur+"]["+i+"]");
                        explorateur.add(new Explorateur(i,couleur));
                    }
                }
                /**
                 ** 2 exemplaires de 1
                 */
                if(i==3){
                    for(int j=1;j<2;j++){
                        System.out.println("création d'explorateur ["+couleur+"]["+i+"]");
                        explorateur.add(new Explorateur(i,couleur));
                    }
                }
                System.out.println("création d'explorateur ["+couleur+"]["+i+"]");
                new RedimensionnerImage("Images/Explo"+couleur+".png");// apres on ajoute la valeur aussii

                explorateur.add(new Explorateur(i,couleur));
            }
        }

        Explorateur.setSize(800,600);
        Explorateur.setLayout(null);
        Explorateur.setVisible(true);
        Explorateur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     ** shuffle: pour mélanger les tuiles aléatoirement
     */
    private void shuffle() {
        Random random= new Random();
        for(int i = 0; i<tuile.size();i++){
            Collections.swap(tuile, i, random.nextInt(tuile.size()));
        }
    }

    public static void main(String[] args) throws IOException {
        new Piece();
    }
}
