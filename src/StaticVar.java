
public class StaticVar {
	String name;// its caled istance variable
	String address;
	static String city = "bangalore";
	static int i =0;

	StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}

	public void getAddress() {
		// return address;
		System.out.println(address + ""+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("Bob", "marthali");
		StaticVar obj1 = new StaticVar("kuriji nagar", "chinnamudalaipatti");
		StaticVar obj2 = new StaticVar("kuriji nagar", "chinnamudalaipatti");
		obj.getAddress();
		obj1.getAddress();
		obj2.getAddress();
	}

}
