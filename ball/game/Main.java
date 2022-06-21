/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball.game;

import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class Main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrame frame = new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		frame.setBounds(200,100, 700, 600);
		frame.setTitle("Breakout Ball");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(gamePlay);
			frame.setVisible(true);

    }
}
