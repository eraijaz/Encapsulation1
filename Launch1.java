class plane
{
	public void fly() 
	{
		System.out.println("plane is flying");
	}
}
	class cargoPlane extends plane
	{
		public void fly()
		{
			System.out.println("cargo plane flies at lowest height");
		}
	}

public class Launch1 {

	public static void main(String[] args) {
		cargoPlane cp=new cargoPlane();
		cp.fly();

	}

}
