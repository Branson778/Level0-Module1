package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String BDay = JOptionPane.showInputDialog("When is your Birthday?")	;
if (BDay.equals("08/06")) {
	
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
	
	JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
}
	
	
}
}

