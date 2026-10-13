package Controlador;

import java.util.stream.Stream;

import javax.swing.JFrame;

import Vista.PanelPrincipal;

public class App {
	public static void main(String[] arg) {
		
		JFrame marco = new JFrame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(marco.EXIT_ON_CLOSE);
		marco.setBounds(100, 100, 800, 400);
		marco.setContentPane(new PanelPrincipal(marco));
		marco.validate();
	}
}
