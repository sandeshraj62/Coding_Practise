package basics;
import java.util.Scanner;
// taking user input and converting int into double ..
public class UserInput_Program_4 
{
	public static void main(String args[])
			{
		     Scanner anmol = new Scanner(System.in);
		     System.out.println("Enter the int variable is:");
		     int a= anmol.nextInt();
		     double d = a;
		     System.out.println("Double Variable is:"+d);
		     
		    // System.out.println("double variable is:"+d);
		     anmol.close();
		     
			}

}
