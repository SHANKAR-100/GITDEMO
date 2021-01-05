package javaPractice;

class bank {
	private int accountnum = 101;
	private String Username = "Shankar";
	private double bal = 1000;

	public double getBal() {
		return bal;
	}

	public String getUsername() {
		return Username;
	}

	public String setUsername(String Newusername) {
		return Newusername;
	}

	public int getAccountnum() {
		return accountnum;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		bank user = new bank();

		System.out.println(user.getUsername());
		System.out.println(user.setUsername("Babu"));
	}

}
