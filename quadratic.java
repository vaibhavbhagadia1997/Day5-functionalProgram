package day5a;
import java.util.Scanner;
public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		double a = input.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = input.nextDouble();
		System.out.println("Enter the value of c: ");
		double c = input.nextDouble();
		double delta = b*b - 4*a*c;
		if (delta > 0.0)
		{
			double r1 = (-b + Math.pow(delta,0.5)) / (2.0 * a);
			double r2 = (-b + Math.pow(delta,0.5)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		else if (delta == 0.0)
		{
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		}
		else
		{
			System.out.println("Roots are not real. ");
		}
		

	}

}
