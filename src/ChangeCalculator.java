//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nick = JOptionPane.showInputDialog("How many nickles?");
		
double n = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
String dime = JOptionPane.showInputDialog("How many dimes?");

double d = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quaters = JOptionPane.showInputDialog("How many quarters?");

double q = Integer.parseInt(quaters);
		// Calculate how much money the user has and save it in a double variable 
double a = n/20+d/10+q/4;
		// Tell the user how much money they have
if (a<1) {
	JOptionPane.showMessageDialog(null, "you have "+(a*100)+" cents");
}
else if (a>1) {
	JOptionPane.showMessageDialog(null, "you have "+a+" dollars");
}
	}
}

