
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AustralianTraffic a = new AustralianTraffic();
		a.redStop();
		a.FlashYello();
		a.greenGo();
		
		
		AustralianTraffic at = new AustralianTraffic();
		at.walkonSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
		
	}

	@Override
	public void FlashYello() {
		// TODO Auto-generated method stub
		System.out.println("flash yello implementation");
		
	}

	@Override
	public void walkonSymbol() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

}
