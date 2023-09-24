
public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I am the constructor");

		System.out.println("I am the constructor lecture 1");
	}

	public ConstructorDemo(int a, int b) {
		System.out.println("I am the parameterized constructor");
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
ConstructorDemo c = new ConstructorDemo();
	}

}
