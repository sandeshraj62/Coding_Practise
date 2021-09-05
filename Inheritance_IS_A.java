package javaOOPS;

class Inheritance_IS_A   // Parents class or super class
{
	void play()
	{
		System.out.println("I am playing:");
	}
}
class Inheritance extends Inheritance_IS_A // child class or sub class
 {
	public static void main(String args[]) 
	{
		Inheritance an= new Inheritance();
		an.play();
	}
 }
