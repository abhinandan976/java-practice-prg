/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class simplecalculator
{
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		System.out.println("Enter the operator:");
		char op = sc.next().charAt(0);
		Double result = 0.00;
		if(op == '+') {
		    result = a + b;
		}
		else if(op == '-') {
		    result = a - b;
		}
		else if (op == '*') {
		    result = a * b;
		}
		else if (op == '/') {
		    if (b != 0) {
		        result = a / b;
		    }
		    else {
		        System.out.println("Division by zero is not possible");
		    }
		}
		else {
		    System.out.println("Invlaid operator");
		}
		System.out.println("The result is:" + result);
	}
}