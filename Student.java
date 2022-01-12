package inheritance;

class Student 
{
   String str = "Sandesh Raj";
}
class Roll extends Student
{
	int roll=16;
}
class id extends Roll
{
	int age=21;
	public static void main(String args[])
	{
		id i = new id();
		System.out.println("My name is :"+i.str);
		System.out.println("My roll number is :"+i.roll);
		System.out.println("My age  is :"+i.age);
		
		
			}
}
