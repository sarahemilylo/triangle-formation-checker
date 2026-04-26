// Triangle Formation Checker

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class triangle_formation_checker implements ActionListener{
	// Properties
	JFrame theFrame = new JFrame("Triangle Formation Checker");
	JPanel thePanel = new JPanel();
	JTextField theA = new JTextField();
	JTextField theB = new JTextField();
	JTextField theC = new JTextField();
	JLabel theTitle = new JLabel("Triangle Formation Checker");
	JLabel theLabel = new JLabel();
	JButton theButton = new JButton("Calculate");
	double dblA = 0;
	double dblB = 0;
	double dblC = 0;
	double dblArea = 0;
	JLabel sideA = new JLabel("Side A =  ");
	JLabel sideB = new JLabel("Side B = ");
	JLabel sideC = new JLabel("Side C = ");
	
	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == theButton){
			dblA = Double.parseDouble(theA.getText());
			sideA.setText("Side A =  " + dblA);
			dblB = Double.parseDouble(theB.getText());
			sideB.setText("Side B = " + dblB);
			dblC = Double.parseDouble(theC.getText());
			sideC.setText("Side C = " + dblC);
			double dblHalfPerimeter = (dblA + dblB + dblC)/2;
			if(dblA < dblHalfPerimeter && dblB < dblHalfPerimeter && dblC < dblHalfPerimeter){
				double dblArea = Math.sqrt(dblHalfPerimeter*(dblHalfPerimeter - dblA)*(dblHalfPerimeter - dblB)*(dblHalfPerimeter - dblC));
				theLabel.setText("The area is " + dblArea);
			}else{
				theLabel.setText("Error, can't make a triangle");
			}
		}else if(evt.getSource() == theA){
			dblA = Double.parseDouble(theA.getText());
			sideA.setText("Side A =  " + dblA);
		}else if(evt.getSource() == theB){
			dblB = Double.parseDouble(theB.getText());
			sideB.setText("Side B = " + dblB);
		}else if(evt.getSource() == theC){
			dblC = Double.parseDouble(theC.getText());
			sideC.setText("Side C = " + dblB);
		}
	}
	
	// Constructor
	public triangle_formation_checker(){
		// Set Panel
		thePanel.setLayout(null);
		thePanel.setPreferredSize(new Dimension(800, 400)); 
		
		// Title
		theTitle.setSize(250, 25);
		theTitle.setLocation(325, 50);
		thePanel.add(theTitle);
		
		// Side A
		sideA.setSize(250, 25);
		sideA.setLocation(100, 110);
		thePanel.add(sideA);
		theA.setSize(400, 40);
		theA.setLocation(300, 100);
		theA.addActionListener(this);
		thePanel.add(theA);
		
		// Side B
		sideB.setSize(250, 25);
		sideB.setLocation(100, 170);
		thePanel.add(sideB);
		theB.setSize(400, 40);
		theB.setLocation(300, 160);
		theB.addActionListener(this);
		thePanel.add(theB);
		
		// Side C
		sideC.setSize(250, 25);
		sideC.setLocation(100, 230);
		thePanel.add(sideC);
		theC.setSize(400, 40);
		theC.setLocation(300, 220);
		theC.addActionListener(this);
		thePanel.add(theC);
		
		// Calculate Button
		theButton.setSize(100, 30);
		theButton.setLocation(350, 300);
		theButton.addActionListener(this);
		thePanel.add(theButton);
		
		// Area Calculation Label
		theLabel.setSize(250, 25);
		theLabel.setLocation(300, 350);
		thePanel.add(theLabel);
		
		// Set Frame
		theFrame.setContentPane(thePanel);
		theFrame.pack();
		theFrame.setDefaultCloseOperation(theFrame.EXIT_ON_CLOSE);
		theFrame.setVisible(true);
	}
	
	// Main Program
	public static void main(String[] args){
		new triangle_formation_checker();
	}
}
