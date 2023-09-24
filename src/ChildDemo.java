
public class ChildDemo extends ParentDemo {

	String name = "QAClickAcademy";
	
	public ChildDemo()
	{
		super();// this should be in the 1st 
		System.out.println("child class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in the child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();

	}

}
