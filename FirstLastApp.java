// Graded lab Main class
// Adam Plesca
// 14/4/23

import javax.swing.JOptionPane;

public class FirstLastApp{
	public static void main(String args[]){

	String input, output;

	StringBuffer strBuff = new StringBuffer();

	FirstLast myFirstLast = new FirstLast();

	input = JOptionPane.showInputDialog(null,"Enter word");
	myFirstLast.setInput(input);

	myFirstLast.compute();
	output = myFirstLast.getOutput();

	JOptionPane.showMessageDialog(null,output);
	}
}