package inheritancepgm;

public class ChildClassDemo  extends childClass{

	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClassDemo cld = new ChildClassDemo();
		cld.getData(2);
		cld.getData("hello");
				
	}

}
