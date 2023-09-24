package inheritancepgm;

public class childClass extends parentClass {
	
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println("colour");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClass cc = new childClass();
		cc.colour();
		cc.brakes();

	}

}
