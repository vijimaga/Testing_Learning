package polymorphism;

public class Son extends Parents {

	@Override

	public void marriage() {
		System.out.println("my marriage is my rule");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parents parents = new Son();

		// parent class refers the child class
		parents.properties();
		parents.marriage();
	}

}
