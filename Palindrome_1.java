package basics;
// check whether the number is Palindrome or not..
public class Palindrome_1 
{
  public static void main(String args[])
  {
	  int num =1234, rev=0,rem;
	  int orgnum=num;
	  while(num!=0)
	  {
		  rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
	  }
	  if(orgnum==rev)
	  {
		  System.out.println( "Number is Palindrome..");
	  }
	  else
	  {
		  System.out.print("Number is not a palindrome..");
	  }
  }
}
