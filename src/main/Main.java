package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

//code

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();// juste pour tester
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
	}

}
