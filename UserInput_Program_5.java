package basics;
import java.util.Scanner;
// Taking input from the user and convert Int data type into Char data type..
public class UserInput_Program_5 
{
  public static void main(String args[])
  {
	  Scanner anmol = new Scanner(System.in);
	  System.out.println("Enter any number is:");
	  int a1= anmol.nextInt();
	  char C= (char)a1;
	  System.out.println("Char is:"+C);
	  anmol.close();
	  
  }
}
