package basics;

public class Reverse_a_number 
{
 public static void main(String args[])
 {
	 int num=12345,rev=0,rem;
	 while(num!=0) 
	 {
		 rem=num%10;   //12345%10=5
		 rev=rev*10+rem;  //0=0*10+5
		 num=num/10;      //
	 }
	 	System.out.println("Reversing a number :"+rev);
 }
}
