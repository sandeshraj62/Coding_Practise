package basics;
// Factorial of number?
public class AN_1
{
  public static void main(String args[])
  {
	  int num=5,fact=1;
	  for(int i=num;i>=1;i--)
	  {
		fact=fact*i;  
	  }
	  System.out.println("Factorial is:"+fact);
	  
  }
}
