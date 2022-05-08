package Controlleur;

import javax.swing.*;
import java.awt.*;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.IOException;

public class ImageZoom {
    public ImageZoom(){
/*
        JFrame frame = new JFrame();
        JPanel panel=new JPanel();
        frame.setContentPane(panel);
       // frame.setLayout(new FlowLayout());
        frame.setSize(800, 600);
        // frame.add(jLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
*/
        JFrame f = new JFrame("Exemple JButton avec image");

        // Récupère l'image source
    Image imgS = Toolkit.getDefaultToolkit().createImage("Images/Tuiles.png");

    // récupération image[0][0]
    Icon Image1 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(9, 10, 70, 70))));
    JButton i1 = new JButton(Image1);
        i1.setBounds(100,0,70,70);
        f.add(i1);

    // récupération de l'image[1][0]
    Icon Image2 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(88, 10, 70, 70))));
    JButton i2 = new JButton(Image2);
        i2.setBounds(200,0,70,70);
        f.add(i2);

    // récupération de l'image[2][0]
    Icon Image3 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(169, 10, 70, 70))));
    JButton i3 = new JButton(Image3);
        i3.setBounds(300,0,70,70);
        f.add(i3);

    // récupération de l'image[0][1]
    Icon Image4 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(9, 90, 70, 70))));
            JButton i4 = new JButton(Image4);
        i4.setBounds(100,100,70,70);
        f.add(i4);

    // récupération de l'image[1][1]
    Icon Image5 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(88, 90, 70, 70))));
             JButton i5 = new JButton(Image5);
        i5.setBounds(200,100,70,70);
             f.add(i5);

    // récupération de l'image[2][1]
    Icon Image6 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(169, 90, 70, 70))));
            JButton i6 = new JButton(Image6);
        i6.setBounds(300,100,70,70);
            f.add(i6);

    // récupération de l'image[0][2]
    Icon Image7 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(9, 170, 70, 70))));
             JButton i7 = new JButton(Image7);
        i7.setBounds(100,200,70,70);
             f.add(i7);

    // récupération de l'image[1][2]
    Icon Image8 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(88, 170, 70, 70))));
            JButton i8 = new JButton(Image8);
        i8.setBounds(200,200,70,70);
            f.add(i8);

    // récupération de l'image[2][2]
    Icon Image9 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(169, 170, 70, 70))));
             JButton i9 = new JButton(Image9);
        i9.setBounds(300,200,70,70);
             f.add(i9);

     // récupération de l'image[0][3]
    Icon Image10 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(9, 250, 70, 70))));
            JButton i10 = new JButton(Image10);
        i10.setBounds(100,300,70,70);
            f.add(i10);


    // récupération de l'image[1][3]
    Icon Image11 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(88, 250, 70, 70))));
             JButton i11 = new JButton(Image11);
        i11.setBounds(200,300,70,70);
             f.add(i11);

    // récupération de l'image[2][3]
    Icon Image12 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(169, 250, 70, 70))));
            JButton i12 = new JButton(Image12);
        i12.setBounds(300,300,70,70);
             f.add(i12);

    // récupération de l'image[0][4]
    Icon Image13 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(9, 330, 70, 70))));
            JButton i13 = new JButton(Image13);
        i13.setBounds(100,400,70,70);
            f.add(i13);

    // récupération de l'image[1][4]
    Icon Image14 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(88, 330, 70, 70))));
             JButton i14 = new JButton(Image14);
        i14.setBounds(200,400,70,70);
             f.add(i14);

    // récupération de l'image[2][4]
    Icon Image15 = new ImageIcon(Toolkit.getDefaultToolkit()
            .createImage(new FilteredImageSource(imgS.getSource(), new CropImageFilter(169, 330, 70, 70))));
             JButton i15 = new JButton(Image15);
        i15.setBounds(300,400,70,70);
             f.add(i15);

        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {

        new ImageZoom ();
    }

}
