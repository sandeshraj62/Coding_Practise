package basics;
// Fibonacci Series..
public class AN_3
{
  public static void main(String args[])
  {
	  int num1=2,num2=4,num3,count=8;
	  System.out.print("Fabonacci Series:");
	  for(int i=1;i<=count;++i)
	  {
		  num3=num1+num2;
		  num1=num2;
		  num2=num3;
		  System.out.print(num3+" ");
	  }  
  }
}
