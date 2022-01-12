package inheritance;
// Inheritance concept is used here
class Employee 
{
   float Salary=40000;
}
class Programmer extends Employee
{
	int bonus=10000;
	public static void main(String args[])
	{
		Programmer p = new Programmer();
		System.out.println("Programmer Salary is: "+p.Salary);
		System.out.println("Programmer Bonus is: "+p.bonus);
		}
}
