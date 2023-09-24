package javacrashlan;

public class WhoistheSuperhero {
	String myheroName =  "Vicky Kaushal";
	
	public void superheroGuessor()
	{
		if(myheroName.equals("iron man"))
		{
			System.out.println("you  thoght about Iron man");
		}
		
		else if(myheroName.equals("super man"))
		{
		System.out.println("you that about super man");
		
		}
		else if(myheroName.equals("Thor"))
		{
			System.out.println("you thought about thor");
		}
		else
		{
			System.out.println("sorry i cant 	guess!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  WhoistheSuperhero hero =new WhoistheSuperhero();
  hero.superheroGuessor();
		  
		
	}

}
