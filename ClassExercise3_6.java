
/**
 * Author: Eli Brennan
 * Class: CSC 200
 * Date: 10/6/2015
 */
import javax.swing.JOptionPane;
public class ClassExercise3_6 {
	//Here I create enum for the months of the year.
	public enum Months {
		January, Febuary, March, April, May, June, July, August, September, October, November, December
	}	
	
	public static void main(String[] args) {
		//Here I create an array call choices with the identifier Months that I created earlier.
		Months[] choices = {Months.January, Months.Febuary, Months.March, Months.April, Months.May,
				Months.June,Months.July, Months.August, Months.September, Months.October,
				Months.November, Months.December};
		//Set input equal to January to initialize the variable.
		Months input = Months.January;
		//Created a while loop to include the switch case for the months, outputting the specific phrase for each season
		//with JOptionPane
		while (input != null){
				input = (Months) JOptionPane.showInputDialog(
			 					null, "Select a month from the list.", "Months",
			 					JOptionPane.INFORMATION_MESSAGE, null, choices, 
			 					choices[0]);
			 			switch (input) {
						case January: JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
							break;
						case Febuary: JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
							break;
						case March: JOptionPane.showMessageDialog(null, "Happy Spring days!");
							break;
						case April: JOptionPane.showMessageDialog(null, "Happy Spring days!");
							break;
						case May: JOptionPane.showMessageDialog(null, "Happy Spring days!");
							break;
						case June: JOptionPane.showMessageDialog(null, "It’s a summer time.");
							break;
						case July: JOptionPane.showMessageDialog(null, "It’s a summer time.");
							break;
						case August: JOptionPane.showMessageDialog(null, "It’s a summer time.");
							break;
						case September: JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
							break;
						case October: JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
							break;
						case November: JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
							break;
						case December: JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
							break;
						}
					}
			 			
		
	}
}


