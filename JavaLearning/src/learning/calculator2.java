package learning;

public class calculator2 extends inheritanceExample {
	public void multiply(int a, int b){
		z = a*b;
		System.out.println(z);
	}
	
	public void division(int a , int b){
		z = a/b;
		System.out.println(z);
	}

	public static void main(String args[]){
	calculator2 cal = new calculator2();
	cal.addition(6, 3);
	cal.multiply(6, 3);
	cal.division(6, 3);
	cal.substraction(6, 3);
	
}
	
}
