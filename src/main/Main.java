package main;

import Vue.Menu.MeuPrincipal;

import java.awt.EventQueue;

import Model.CouleurExplorateur;
import Model.MainJoueur;

//code

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJoueur main= new MainJoueur();
					main.initPionExporateur(CouleurExplorateur.BLEU);
					new MeuPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
	}

}
