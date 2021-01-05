//Polymorphism via method Overloading

package javaPractice;

class bird {
	public void sing() {         //First method
		System.out.println("First bird is singing");
	}

	public void sing(int i) {         //Second method
		System.out.println("Second " + i +  " bird is singing");
	}

	public void sing(boolean f) {       //Third method
		System.out.println("third bird is singing");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		bird b = new bird();
		b.sing();
		b.sing(5);
		b.sing(true);
	}

}
