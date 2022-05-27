package Controlleur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RedimensionnerImage {
    public static void main(String[] args) throws IOException {

        new RedimensionnerImage("Images/ExploBleu.png");
    }

    public RedimensionnerImage(String imagePathToRead) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File(imagePathToRead));
        Image image = bufferedImage.getScaledInstance(1200, 720, Image.SCALE_DEFAULT);

      ImageIcon icon = new ImageIcon(image);
       // JFrame frame = new JFrame();
       // frame.setLayout(new FlowLayout());
        //frame.setSize(800, 600);

        JLabel jLabel = new JLabel();
        //jLabel.setBounds(100, 100, 100, 100);
        jLabel.setIcon(icon);
       // frame.add(jLabel);
       // frame.setVisible(true);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}