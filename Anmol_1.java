package basics;
// Find the Factorial of Number..
public class Anmol_1 
{
  public static void main(String args[])
  {
	  int num=6,fact=1;
	  for(int i=num;i>=1;i--)
	  {
		 fact=fact*i; 
	  }
	  System.out.println("Factorial of number is: "+fact);
  }
}
