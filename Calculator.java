import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Number 1 : ");
		double a = s.nextDouble();
		System.out.print("Enter The Number 2 : ");
		double b = s.nextDouble();
		System.out.println("Enter The Operation You Need to Perform  ( + , - , * , / ) : ");
		char op = s.next().charAt(0);
		switch (op) {
		case '+': {
			double c = a + b;
			System.out.println("Addition Of 2 Number is : " + c);
			break;
		}
		case '-': {
			double c = a - b;
			System.out.println("Subraction Of 2 Number is : " + c);
			break;
		}
		case '*': {
			double c = a * b;
			System.out.println("Multiplication Of 2 Number is : " + c);
			break;
		}
		case '/': {
			if (b != 0) {
				double c = a / b;
				System.out.println("Division Of 2 Number is : " + c);
				break;
			} else {
				System.out.println("Division Can't be formed because the second Number is 0");
			}
		}
		default:
			System.out.println("Invalid Operator");
			break;
		}
		s.close();
	}

}
