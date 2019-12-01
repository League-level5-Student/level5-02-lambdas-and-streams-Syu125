package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e)->{
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("First number"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Second number"));
		});
		randNumber.addActionListener((e)->{
			Random r = new Random();
			int i = r.nextInt(10);
			JOptionPane.showMessageDialog(null, i);
		});
		tellAJoke.addActionListener((e)->{
			JOptionPane.showInputDialog("Knock Knock");
			JOptionPane.showInputDialog("Who");
			JOptionPane.showMessageDialog(null,"There's an owl in the house.");
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
