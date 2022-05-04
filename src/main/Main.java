package main;

import Vue.Menu.MeuPrincipal;

import java.awt.EventQueue;

//code

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
