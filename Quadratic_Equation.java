package basics;
// Quadratic equation = ax^2 + bx + c     a cannot be a=0
// b^2-4ac = determinant of quadratic equations
// if determinant >=0 , then its real
// if determinant <=0 , then its complex or imaginary..
public class Quadratic_Equation 
{
  public static void main(String args[])
  {
	  double a = 2.3, b = 4, c = 5.6 ; // value of a,b,c
	  double determinant,root1=0,root2=0;
	  determinant = b*b-4*a*c;   //;; determinant value 
	  // if determinant is greater than and  equal to 0
	  if(determinant >= 0)
	  {
		  root1 = (-b + Math.sqrt(determinant))/2*a;
		  root2 = (-b - Math.sqrt(determinant))/2*a;
		  System.out.format("root1 = %.2f and root2 = %.2f");
	  }
	  else {
		// if determinant is less than and  equal to 0
		  double real =-b/(2*a);
		  double imaginary= Math.sqrt(-determinant)/(2*a);
		  System.out.format("root1 =%.2f+%.2fi",real,imaginary);
		  System.out.format("\nroot2 =%.2f-%.2fi",real,imaginary);
		  }
  }
}