package basics;
// *****
// ****
// ***
// **
// *
public class AN_5 
{
  public static void main(String args[])
  {
	  for(int i=1;i<=5;i++)             // *****
	  {                                 // ****
		  for(int j=1;j>=i;i--)
		  {
			  System.out.print("*");
		  }
		System.out.println();
	  }
  }
}
