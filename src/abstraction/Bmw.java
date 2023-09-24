package abstraction;

public class Bmw extends Car implements UpcomingProjects	{

	@Override
	public void engineSecret()
	{
		System.out.println("BMW Engine Secret");
	}
	@Override
	public void companyValut()
	{
		System.out.println("BMW company valut");
	}
	public static void main(String[] args) {
		
		Car car = new Bmw();
		car.engineSecret();
		car.companyValut();
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is method 2");
	}
	@Override
	public void methos3() {
		// TODO Auto-generated method stub
		System.out.println("this is method 3");
	}

}
