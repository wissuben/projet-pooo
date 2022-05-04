package main;

import Vue.Menu.GetAction;
import main.Fenetre;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Menu implements ActionListener {
    private JButton valider;
    private JButton bouton2;
    private JTextField textFieldPseudo1;
    private JTextField textFieldPseudo2;
    private JTextField textFieldPseudo3;
    private JTextField textFieldPseudo4;
    private JLabel label;

    private JLabel labelPseudo1;
    private JLabel labelPseudo2;
    private JLabel labelPseudo3;
    private JLabel labelPseudo4;

    public Menu() {
        Fenetre menu = new Fenetre("Menu");
        JPanel panel = new JPanel();
        menu.setContentPane(panel);

        panel.setBackground(Color.blue);
        label = new JLabel("Saisir pseudo");
        panel.add(label);

/**********************************Pseudo1****************************************/
        textFieldPseudo1 = new JTextField();
        textFieldPseudo1.setColumns(10); //On lui donne un nombre de colonnes à afficher
        panel.add(textFieldPseudo1);
/**********************************Pseudo2****************************************/
        textFieldPseudo2 = new JTextField();
        textFieldPseudo2.setColumns(10);
        panel.add(textFieldPseudo2);
/**********************************Pseudo3****************************************/
        textFieldPseudo3 = new JTextField();
        textFieldPseudo3.setColumns(10);
        panel.add(textFieldPseudo3);
/**********************************Pseudo4****************************************/
        textFieldPseudo4 = new JTextField();
        textFieldPseudo4.setColumns(10);
        panel.add(textFieldPseudo4);


        JButton boutonn = new JButton(new GetAction(this, "afficher le pseudo"));

        panel.add(boutonn);

        valider = new JButton("Valider");
        valider.addActionListener( this);
        panel.add(valider);

        bouton2 = new JButton("Ou là !");
        bouton2.addActionListener(this);
        panel.add(bouton2);

        labelPseudo1 = new JLabel();
        panel.add(labelPseudo1);

        menu.setVisible(true);//On la rend visible
}


    public JTextField getTextFieldPseudo1(){
        return textFieldPseudo1;
    }

    public JLabel getLabelPseudo(){
        return labelPseudo1;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == valider){
            /**
             * J'ai mis les affichages juste pour faciliter le débogage
             */
            System.out.println("Vous avez cliqué sur valider.");

        } else if(source == bouton2){
            System.out.println("Vous avez cliqué là.");
        }
    }
}