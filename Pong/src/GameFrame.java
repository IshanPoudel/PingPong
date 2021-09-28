import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//contains minimize , maximize bittom

public class GameFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GamePanel panel = new GamePanel();
	
	
	
	
	
	GameFrame(){
		
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();  
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}

}
