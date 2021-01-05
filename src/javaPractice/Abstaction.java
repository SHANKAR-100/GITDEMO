package javaPractice;

abstract class abst {

	abstract void walk();

	void run() {
		System.out.println("I am running");
	}
}

public class Abstaction extends abst {

	public static void main(String[] args) {
		Abstaction abs = new Abstaction();
		abs.walk();
		abs.run();
	}

	@Override
	void walk() {
		System.out.println("I am walking");
	}

}
