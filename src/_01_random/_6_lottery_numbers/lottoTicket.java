package _01_random._6_lottery_numbers;
import java.util.Random;
import javax.swing.JOptionPane;
public class lottoTicket {
public static void main(String[] args) {
	Random ran1 = new Random();
	int n1 = ran1.nextInt(72)+1;
	Random ran2 = new Random();
	int n2 = ran2.nextInt(72)+1;
	Random ran3 = new Random();
	int n3 = ran3.nextInt(72)+1;
	Random ran4 = new Random();
	int n4 = ran4.nextInt(72)+1;
	Random ran5 = new Random();
	int n5 = ran5.nextInt(72)+1;
	Random ran6 = new Random();
	int n6 = ran6.nextInt(72)+1;
	
	JOptionPane.showMessageDialog(null, "Your lotto numbers are: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + ".");
}
}
