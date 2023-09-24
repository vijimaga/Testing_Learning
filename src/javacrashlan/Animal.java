package javacrashlan;

public class Animal {

	String animal_name;
	String animal_type;
	Animal(String name,String type)
	{
		animal_name=name;
		animal_type=type;
		
	}
	public void sayAboutAnimal()
	{
		System.out.println("Animal name is "+animal_name+" and type is "+animal_type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal=new Animal("lion", "omnivores");
		animal.sayAboutAnimal();
		
		Animal anima2=new Animal("Karadi", "omnivores");
		anima2.sayAboutAnimal();
	}

}
