package basics;
// check whether the year is leap year or not
public class Program_8 
{
	public static void main(String args[])
	{
		int year=2012;
		if(year%400==0 || ((year%4==0)&&(year%100!=0)))
		{
			System.out.println(year+ " is a leap year.");
		}
		else
		{
			System.out.println(year+ " not a leap year.");
		}
	}

}
