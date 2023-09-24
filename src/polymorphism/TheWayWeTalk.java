package polymorphism;

public class TheWayWeTalk {

	public void talk(Parents styleofTalking)
	{
		System.out.println("polite and respectable");
	}
	
	public void talk(Partner styleofTalking)
	{
		System.out.println("love,romantic and a mixted of everything");
	}
	
	public void talk(Boss styleofTalking)
	{
		System.out.println("nothing personl purebusiness");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheWayWeTalk talk = new TheWayWeTalk();
		Parents parents = new Parents();
		talk.talk(parents);
		
		Boss boss = new Boss();
		talk.talk(boss);
		
		Partner partner=new Partner();
		talk.talk(partner);

	}

}
