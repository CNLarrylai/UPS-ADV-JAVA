import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Helloworld extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helloworld myWorld = new Helloworld();
		myWorld.setVisible(true);
	}
	
	public Helloworld(){
		super("My First Swing App");
		
		getContentPane().setLayout(new FlowLayout());
		
		//Create a hi button
		JButton sayHiButton = new JButton("Say Hi");
		
		add(sayHiButton);
		sayHiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("hi");
			}
		});
		
		//Create a bye button
		JButton sayByeButton = new JButton("say bye");
		add(sayByeButton);
		sayByeButton.addActionListener(
				event -> sayBye()
				);
		
		setPreferredSize(new Dimension(600,400));
		pack();
		
	}
	
	
	public void sayHi(){
		System.out.println("HI");
	}
	
	public void sayBye(){
		System.out.println("bye");
		
	}

}
