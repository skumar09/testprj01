package learning;

public class calculator {
	public static double addition(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1+d2;
	}
	public static double substraction(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1-d2;
	}
	public static double multiply(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1*d2;
	}
	public static double divide(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		System.out.println("dishkau");
		return d1/d2;
	}
}
