
public class ChildEmirates  extends ParentAirCraft{

	public static void main(String args[])
	{
		ChildEmirates c = new ChildEmirates();
		//safeyGuideLines();
		c.engine();
		c.safetyGuideLines();
		c.bodyColour();
	}
	

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Red colour on the body");
	}
	

}
