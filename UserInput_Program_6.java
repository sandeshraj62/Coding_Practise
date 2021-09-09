package basics;
import java.util.Scanner;
public class UserInput_Program_6
{
  public static void main(String args[])
  {
	  Scanner anmol = new Scanner(System.in);
	  System.out.println("Enter any Alphabet .");
	  String alp = anmol.nextLine();
	  if(alp =="a"|| alp =="A" || alp =="E" || alp =="e" ||alp =="i" || alp =="I" || alp =="o" || alp =="O" || alp =="u" || alp =="U")
	  { 
		  System.out.println(alp+" is vowel.");
	  }
	  else
	  {
		  System.out.println(alp+" is consonant.");
	  }
	  anmol.close();
  }
}
