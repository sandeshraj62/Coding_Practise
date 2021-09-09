package basics;
// Check vowel and consonant..
// through Switch case..
public class Program_7 {
	public static void main(String args[])
	{
		String alphabet ="a";
		switch(alphabet)
		{
		 case "a":
		 case "A":
		 case "E":
	     case "e":
	     case "I":
		 case "i":
		 case "o":
		 case "O":
		 case "U":
		 case "u":
			 
	    System.out.println(alphabet+" is vowel.");
	    break;
		 
		default:
			System.out.println(alphabet+" consonent.");
	}
	}
		
}
