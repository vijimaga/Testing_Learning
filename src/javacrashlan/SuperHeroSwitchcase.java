package javacrashlan;

public class SuperHeroSwitchcase {

	String hero="Captain America";
	public void heroOrNot()
	{
		switch(hero)
		{
		case "Captain America":
		
			System.out.println("Captain America is the super hero");
			break;
		case "super man":
			System.out.println("super man is the super hero");
			break;
		case "Bat man":
			System.out.println("Bat man is the super hero");
			break;
		default:
			System.out.println(hero +"sorry i dont know the person");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperHeroSwitchcase heroOrNot = new SuperHeroSwitchcase();
		heroOrNot.heroOrNot();
	}

}
