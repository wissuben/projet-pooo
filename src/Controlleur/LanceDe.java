package Controlleur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class LanceDe implements ActionListener{
    public LanceDe() throws IOException {

        JFrame f=new JFrame("Lancer du de");

        // de
        BufferedImage de = ImageIO.read(new File("Images/De-Monstres.png"));
        Icon dee = new ImageIcon(de);
        JButton d = new JButton(dee);
        d.addActionListener((ActionListener) this);
        d.setBounds(100,20,100,100);
        f.add(d);

        // serpent
        BufferedImage imageSerpent = ImageIO.read(new File("Images/DeSerpentMer.png"));
        Icon serpent = new ImageIcon(imageSerpent);
        JButton d0 = new JButton(serpent);
        d0.setBounds(100,200,70,70);
       // f.add(d0);

        // requin
        BufferedImage imageRequin = ImageIO.read(new File("Images/DeRequin.png"));
        Icon requin = new ImageIcon(imageRequin);
        JButton d1 = new JButton(requin);
        d1.setBounds(200,200,70,70);
        //f.add(d1);

        // baleine
        BufferedImage imageBaleine = ImageIO.read(new File("Images/DeBaleine.png"));
        Icon baleine = new ImageIcon(imageBaleine);
        JButton d2 = new JButton(baleine);
        d2.setBounds(300,200,70,70);
       // f.add(d2);

      int i= actionPerformed();
        if(i==0){
            f.add(d0);
        }
        if(i==1){
            f.add(d1);
        }
        if(i==2){
            f.add(d2);
        }

        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {

        new LanceDe ();

    }

    public int actionPerformed() {
        int i= new Random().nextInt(3 + 0);
        System.out.println(i);
        return i;
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        int i= new Random().nextInt(3 + 0);
        System.out.println(i);
    }
}
