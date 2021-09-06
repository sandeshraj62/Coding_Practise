package basics;
import java.util.Scanner;
// Swaping of two number ?
// input taken from user..
public class UserInput_Program_3 
{
  public static void main(String args[])
	{
	  Scanner anmol = new Scanner(System.in);
	  System.out.println("Enter the first number:");
	  int a1= anmol.nextInt();
	  System.out.println("Enter the Second number:");
	  int a2= anmol.nextInt();
	  int temp;
	  temp=a1;
	  a1=a2;
	  a2=temp;
	  System.out.println("Swaping of number are:");
	  System.out.println(+a1);
	  System.out.println(+a2);
	  anmol.close();
	  
	  
		  }
}
