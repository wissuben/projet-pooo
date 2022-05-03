package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    private JButton valider;
    private JButton bouton2;
    private JTextField textFieldPseudo1;
    private JTextField textFieldPseudo2;
    private JTextField textFieldPseudo3;
    private JTextField textFieldPseudo4;
    private JLabel label;
    public Menu() {
        Fenetre menu = new Fenetre("Menu");
        JPanel panel = new JPanel();
        menu.setContentPane(panel);

        panel.setBackground(Color.blue);
        label = new JLabel("Saisir pseudo");
        panel.add(label);

        textFieldPseudo1 = new JTextField();
        textFieldPseudo1.setColumns(10); //On lui donne un nombre de colonnes à afficher
        panel.add(textFieldPseudo1);

        textFieldPseudo2 = new JTextField();
        textFieldPseudo2.setColumns(10);
        panel.add(textFieldPseudo2);

        textFieldPseudo3 = new JTextField();
        textFieldPseudo3.setColumns(10);
        panel.add(textFieldPseudo3);

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

        menu.setVisible(true);//On la rend visible
}


    public JTextField getTextField(){
        return textFieldPseudo1;
    }

    public JLabel getLabel(){
        return label;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == valider){
            System.out.println("Vous avez cliqué sur valider."+textFieldPseudo1.getText());
        } else if(source == bouton2){
            System.out.println("Vous avez cliqué là.");
        }
    }
}