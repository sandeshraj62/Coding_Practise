package practise;
import java.util.Scanner;
// Getting user input and printing //
public class Practise_1 
{
	public static void main(String arg[])
	{
		Scanner anmol = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name =anmol.next();
		System.out.println("Enter your roll no:");
	    int rollno =anmol.nextInt();
	    System.out.println("Enter your stream:");
	    String stream =anmol.next();
	    System.out.println("Enter your name :"+name);
	    System.out.println("Enter your roll number:"+rollno);
	    System.out.println("Enter your stream:"+stream);
	    anmol.close();
	    
	}
}
