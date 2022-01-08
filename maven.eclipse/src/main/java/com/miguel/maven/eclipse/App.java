package com.miguel.maven.eclipse;


import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		// Cambio sobre el codigo a ver si funciona el commit y push

		//Creating the window with all its awesome snaky features
		Window f1 = new Window();
		
		//Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(300, 300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	}
}
