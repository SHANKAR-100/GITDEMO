//Polymorphism via method Overriding

package javaPractice;

class dad {
	public void mobile() {
		System.out.println("Its old nokia");
	}
}

class son extends dad {
	public void mobile() {
		System.out.println("Realme");
	}
}

public class Polymoroverriding {

	public static void main(String[] args) {

		son s = new son();
		s.mobile();
		dad d = new dad();
		d.mobile();

	}

}
