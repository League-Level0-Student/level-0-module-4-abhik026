package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        
	String day	= JOptionPane.showInputDialog("What day is it?");
		
		if(day.equalsIgnoreCase("sunday")|| day.equalsIgnoreCase("saturday")){
		isWeekend = true;	
		}
		else {
			isWeekend = false;
		}
		
		if(isWeekend) {
		JOptionPane.showMessageDialog(null, "You get to sleep in!");	
		}
		else if(!isWeekend){
		JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");	
		}
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

		String exam	= JOptionPane.showInputDialog("What did you get on your last test?");
		double pass = Double.parseDouble(exam);
		 if(pass >= 70) {
			 passedExam = true;
			 System.out.println("hi");
		 }
		 else {
			 passedExam = false;
		 }
		if(passedExam) {
			JOptionPane.showMessageDialog(null, "Congrats, you passed");
			System.out.println("pass");
		}
		else if(!passedExam) {
			JOptionPane.showMessageDialog(null, "Tough, GL next time");
		}
		 // If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("Is the game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		JOptionPane.showMessageDialog(null, "Game Over");
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		for(int e =0; e<1;) {
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
	String color = 	JOptionPane.showInputDialog("Choose A Color");
		if(color.equalsIgnoreCase("red")) {
			isRed = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Not Red, don't recognize");
		}
		boolean isSquare = false;		
		
		String shape = 	JOptionPane.showInputDialog("Choose A Shape");
		if(shape.equalsIgnoreCase("square")) {
			isSquare = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Not a Square, don't recognize");
		}
		
		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		if(isRed && isSquare) {
			drawRedSquare();
			System.exit(0);
		}
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setSpeed(75);
		rob.penDown();
		rob.setPenWidth(10);
		rob.setPenColor(200, 10, 0);
		for(int i = 0; i<4; i++) {
			rob.move(150);
			rob.turn(90);
		}
		// Complete the rest of this method
	}	
}
