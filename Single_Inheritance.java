package inheritance;

 class Single_Inheritance   // Parents Class
{
   void ShowA()   // Method 
   {
	   System.out.println("A method :");
   }
}
class B extends Single_Inheritance  // Child class or subclass
{
	void ShowB()  // Method
	{
		System.out.println("B method :");
	}
	public static void main(String args[])
	{
		Single_Inheritance ob1= new Single_Inheritance();  // ob1 is created as it call only method from Single_inheritance class
		ob1.ShowA();
		B ob2 = new B();   
		ob2.ShowB();
		ob2.ShowA();
	}
}
