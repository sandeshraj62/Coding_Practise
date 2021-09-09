package basics;
// GCD (Greatest common divisor) // HCF(Highest common factor)
public class Program_11 
{
	public static void main(String args[])
	{
		int n1=81, n2=153;
		int hcf=1;
		for(int i=1;(i<=n1 && i<=n2); i++)
		{
          if(n1%i==0 && n2%i==0)
          {
        	  hcf=i;
          }	
		}
          System.out.println("HCF of "+n1+" and "+n2+" is "+hcf);
	}
 }

