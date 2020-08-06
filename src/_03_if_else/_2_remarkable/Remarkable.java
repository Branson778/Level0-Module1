package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Dave = "Coding";
String Branson = "Likes cats";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String Answer = JOptionPane.showInputDialog("Who is in your class?");
if (Answer.equals("Branson")) {
	JOptionPane.showMessageDialog(null, Branson);
}
else if (Answer.equals("Dave")) {
	JOptionPane.showMessageDialog(null, Dave);
}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

