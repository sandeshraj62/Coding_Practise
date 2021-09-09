package basics;

public class Fiboacci_Series 
{
 public static void main(String args[])
 {
	 int a1=0,a2=1,a3,count=8;
	 System.out.println("Fibonacci Series :");
	 for(int i=1;i<=count;++i)
	 {
		 a3=a1+a2;
		 a1=a2;
		 a2=a3;
		System.out.print(a3+" "); 
	 }
	 
	 
 }
}
