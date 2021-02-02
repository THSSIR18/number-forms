import java.util.Scanner;
import java.text.DecimalFormat;

public class NumberForms
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat aForm = new DecimalFormat("0");
		DecimalFormat dForm = new DecimalFormat("0.000");
		System.out.print("Enter a number: ");
		double num = sc.nextDouble();
		double num1 = num;
		System.out.println("The number is " + num);
		System.out.println("The number is " + ((int)num));
		System.out.println("The suare number is " + Math.pow(num,2));
		System.out.println("The suare root of a number is " + dForm.format(Math.sqrt(num1)));
		 
	}
}