package javacrashlan;

public class Draw {

	String draw;
	Draw()
	{
		System.out.println("draw object is created");
	}
	 Draw(String toDraw)
	{
		draw=toDraw;
		System.out.println("Drawing"+toDraw);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Draw draw=new Draw();
		Draw draw1=new Draw("circle");
	}

}
