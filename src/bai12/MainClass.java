package bai12;

import javax.swing.JFrame;

public class MainClass {

	// Constructor
	public MainClass() 
	{
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new MainClass();
		
	}

}
