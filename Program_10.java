package basics;
import java.util.Scanner;
// Table of number.. 
public class Program_10
{
  public static void main(String args[])
  {
	  Scanner anmol = new Scanner(System.in);
	  System.out.println("Enter any number:");
	  int num= anmol.nextInt();
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(num+"X"+i+"="+num*i);
	  }
	  anmol.close();
  }
}
