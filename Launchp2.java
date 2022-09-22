//code not working

class telusko
{
	
}

class alian extends telusko
{
	
}
class plane1
{
	public telusko fly() 
	{
		System.out.println("telusko");
		telusko t =new telusko();
		return t;
	}
		
	class cargoPlane extends plane1
	{
		public alian fly()
		{
			System.out.println("cargo plane flies at lowest height");
			alian a= new alian();
			return a;
		}
	}
public class Launch2 {

	public static void main(String[] args) 
	{
		
		plane1 p=new plane1();
		p.fly();
		
	}

}
}
