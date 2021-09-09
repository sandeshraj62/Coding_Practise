package basics;
import java.util.Scanner;
// Sum of Natural number.
public class Program_9
{
 public static void main(String args[])
 {
	 Scanner anmol = new Scanner(System.in);
	 System.out.println("Enter any number:");
	 int num = anmol.nextInt();
	 int sum=0;
	 for(int i=1;i<num;i++)
	 {
		 sum=sum+i;
	 }
	 System.out.println("Sum of number is:"+sum);
	 anmol.close();
	 // 1+2+3+4=10
	 // 1+2+3+4+5=15
 }
}
