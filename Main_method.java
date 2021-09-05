package javaOOPS;
// public = access modifier, class =class, Maib_method=class name 
 class Main_method {
	public void study()
	{
		System.out.println("I am studying.");
	}
	public  static void main(String args[]) // this is main method
	{
		System.out.println("MAIN METHOD OF THE PROGRAM. ");
	// Scanner is used to create object AND  Scanner is also a CONSTRUTER.
	     Main_method anmol= new Main_method();
	     anmol.study();
	     anmol.playing();
	// anmol is name of the object 
	// new keyword is used to create object 
	}
	public void playing()
	{
		System.out.println("I am playing cricket:");
	}
}

