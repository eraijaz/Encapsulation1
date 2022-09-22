class plane2 {
	public void fly() {
		System.out.println("plane is flying");
	}

	public void takeoff() {
		System.out.println("plane is taking off");

	}
}

class cargoPlane1 extends plane2 {
	public void fly() {
		System.out.println("cargo plane flies at lowest height");
	}

	public void takeoff() {
		System.out.println("Cargo plane carry goods");

	}
}

class PassengerPlane extends plane2

{
	public void fly() {
		System.out.println("passenger plane flies ar medium height");
	}

	public void takeoff() {
		System.out.println("passemger plane carries passengers");
	}
}

class airport
{
	public void permit(plane2 p) 
	{
		p.fly();
		p.takeoff();
	}
}

public class LaunchPlane {

	public static void main(String[] args) {
		cargoPlane1 cp = new cargoPlane1();
		PassengerPlane pp =new PassengerPlane();
		airport a=new airport();
		a.permit(cp);
		a.permit(pp);
		
		
		/*
		 * plane2 p; p=cp; p.fly(); p.takeoff(); // 1:m polymorphism p=pp;
		 * 
		 * p.fly(); p.takeoff();
		 */
			 
	   
		 
	}

}
