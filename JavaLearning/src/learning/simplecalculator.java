package learning;
import java.lang.String;
import java.util.Scanner;
import learning.calculator;

public class simplecalculator extends calculator {
	
	public static void main(String[] args){
		String s1 = getnumber("Please enter the number\n");
		String s2 = getnumber("Please enter the number");
		String op = getnumber("Please choose the operation + , - , * , /");
		double result;
		result = 0;
		
		try{
			switch (op){
			case "+":
				result = calculator.addition(s1, s2);
				break;
			case "-":
				result = calculator.substraction(s1, s2);
				break;
			case "*":
				result = calculator.multiply(s1, s2);
				break;
			case "/":
				result = calculator.divide(s1, s2);
				break;
			default :
				System.out.println("Unrecognied operation");
				return;
			}
		}catch (Exception e){
			System.out.println("Number formatting exception"+e.getMessage());
		}
		System.out.println(result);
	}
	
	public static String getnumber(String label){
		System.out.println(label);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
