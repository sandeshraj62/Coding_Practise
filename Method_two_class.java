package javaOOPS;
class Method_two_class 
{
	public void animal()
	{
		System.out.println("First animal is : Tiger");
	}
	public static void main(String args[])
	{
		Method_two_class anm= new Method_two_class();
		anm.animal();
		Birds nm= new Birds();  /// other class object is used in main method
		nm.fly();
	}
}
class Birds
{
	public void fly()
	{
		System.out.println("Bird are flying.");
	}

}

