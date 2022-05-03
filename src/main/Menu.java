package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    private JButton bouton;
    private JButton bouton2;
    private JTextField textField;
    private JLabel label;
    public Menu() {
        Fenetre menu = new Fenetre("Menu");
        JPanel panel = new JPanel();
        menu.setContentPane(panel);

        panel.setBackground(Color.blue);
        JLabel label = new JLabel("Saisir pseudo");
        panel.add(label);

        JTextField textField = new JTextField();
        textField.setColumns(10); //On lui donne un nombre de colonnes à afficher
        panel.add(textField);

        JButton boutonn = new JButton(new GetAction(this, "afficher le pseudo")); //probleme pas encore réglé

        panel.add(boutonn);

        bouton = new JButton("Valider");
        bouton.addActionListener( this);
        panel.add(bouton);

        bouton2 = new JButton("Ou là !");
        bouton2.addActionListener(this);
        panel.add(bouton2);

        menu.setVisible(true);//On la rend visible
}


    public JTextField getTextField(){
        return textField;
    }

    public JLabel getLabel(){
        return label;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == bouton){
            System.out.println("Vous avez cliqué sur valider.");
        } else if(source == bouton2){
            System.out.println("Vous avez cliqué là.");
        }
    }
}