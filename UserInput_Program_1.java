package basics;
import java.util.Scanner;
public class UserInput_Program_1
// // calculate Quotient and Remainder from the given dividend and divisor ?
// take input from the user.
{
	public static void main(String args[])
			{
		     Scanner obj= new Scanner(System.in);
		     System.out.println("Enter the Dividend :");
		     int dividend = obj.nextInt();
		     System.out.println("Enter the Divisor :");
		     int divisor = obj.nextInt();
		     int quotient,remainder;
		     quotient=(dividend/divisor);
		     remainder=(dividend%divisor);
		     System.out.println("Quotient is :"+quotient);
		     System.out.println("Remainder is :"+remainder);
		     obj.close();
		     
		
			}

}
