package basics;
import java.util.Scanner;
// // Find the round number  up to 3 decimal places?..
public class UserInput_Program_2 
{
 public static void main(String args[])
 {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter the decimal number :");
	 double num = obj.nextDouble();
	 System.out.println("The decimal number upto 3 decimal places :");
	 System.out.format("%.3f",+num);
	 obj.close();
	 
 }
}
