package javaPractice;

class Calculator {
	public int add(int i, int j) {

		return i + j;
	}
}

class Calculator1 extends Calculator {
	public int sub(int i, int j) {

		return i - j;
	}
}

class Calculator2 extends Calculator1 {
	public int mul(int i, int j) {

		return i * j;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();

		int result = cal.add(45, 55);
		System.out.println(result);
		
		int result1 = cal.sub(45, 55);
		System.out.println(result1);
		
		int result2 = cal.mul(45, 55);
		System.out.println(result2);

	}

}

