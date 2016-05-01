import java.util.Scanner;
import javax.swing.JOptionPane;
public class AccountBalanceInterest {
	
	public void annualCalculation() {
		int time = 0;
		double balance = 10;
		double interest = 0;
		boolean repeat = false;
		String interestType;
		
		
		int answer =
			JOptionPane.showConfirmDialog(null, "Yes to input , no to exit",
			"Annual Interest Calculator", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			repeat = true;
			}
		else {
			repeat = false;
			}
			
		while (repeat)  {
			 
			interestType = JOptionPane.showInputDialog("Indicate 1 for annual, 2 for monthly, or 3 daily rate.");
			int getInterestType = Integer.parseInt(interestType);
			if (getInterestType == 1) {
				interest = .02;
				time = 1;
				}
			else if (getInterestType == 2) {
				interest = .167;
				time = 12;
				}
			else if (getInterestType == 3) {
				interest = .005;
				time = 365;
				}
			else {
				System.out.println("You didn't cooperate... Your punishment is to restart the program.");
				System.exit(0);
				}			
					
			
			for (int q = 1; q <= time; q++){
				balance = balance + (balance * interest);
			}
			JOptionPane.showMessageDialog(null,"The balance after 1 year is: " + balance, "Annual Interest Calculator", JOptionPane.PLAIN_MESSAGE);
			answer =
			JOptionPane.showConfirmDialog(null, "Yes account for another year. Balance is retained. No to exit",
			"Annual Interest Calculator", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			repeat = true;
			}
		else {
			repeat = false;
			}
		}
		}
	
	public static void main (String args[]) {
		
	}
	
	}
