
import javax.swing.JOptionPane;
public class ClassExercise3_6 {
	public enum Months {
		January, Febuary, March, April, May, June, July, August, September, October, November, December
	}	
	
	public static void main(String[] args) {
		Months[] choices = {Months.January, Months.Febuary, Months.March, Months.April, Months.May,
				Months.June,Months.July, Months.August, Months.September, Months.October,
				Months.November, Months.December};
		
		boolean continueLoop = true;
		Months input = Months.January;
		while (input != null){
				input = (Months) JOptionPane.showInputDialog(
			 					null, "Select a month from the list.", "Months",
			 					JOptionPane.INFORMATION_MESSAGE, null, choices, 
			 					choices[0]);
			 			switch (input) {
						case January: System.out.println("Do you want to build a snow man?");
							break;
						case Febuary: System.out.println("Do you want to build a snow man?");
							break;
						case March: System.out.println("Happy Spring days!");
							break;
						case April: System.out.println("Happy Spring days!");
							break;
						case May: System.out.println("Happy Spring days!");
							break;
						case June: System.out.println("It’s a summer time.");
							break;
						case July: System.out.println("It’s a summer time.");
							break;
						case August: System.out.println("It’s a summer time.");
							break;
						case September: System.out.println("Welcome to the foliage season!");
							break;
						case October: System.out.println("Welcome to the foliage season!");
							break;
						case November: System.out.println("Welcome to the foliage season!");
							break;
						case December: System.out.println("Do you want to build a snow man?");
							break;
						}
					}
			 			
		
	}
}


