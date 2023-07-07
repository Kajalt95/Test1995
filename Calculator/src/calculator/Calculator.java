package calculator;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args){

	char operator;
	double num1, num2 , Result;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Select an operator : +, -, * or /");
	operator = input.next().charAt(0);
	
	System.out.println("Enter first Number");
	num1 = input.nextDouble();
	
	System.out.println("Enter Second Number");
	num2 = input.nextDouble();
	
	
	switch(operator) {
	
	case '+' :
		Result = num1+num2;
		System.out.println(num1 + "+" + num2 + " = " + Result);
		break;
		
	case '-' :
		Result = num1-num2;
		System.out.println(num1 + "-" + num2 + " = " + Result);
		break;
		
		
	case '*' :
		Result = num1*num2;
		System.out.println(num1 + "*" + num2 + " = " + Result);
		break;
		
	case '/' :
		Result = num1/num2;
		System.out.println(num1 + "/" + num2 + " = " + Result);
		break;
		
		default:
			System.out.println("Invalid Operator");
		
	}
	
	input.close();
	
	
	}
	
	
}
