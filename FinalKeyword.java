 class demo1  //final class cant be inherited
{
	final public void display() 
	{
		System.out.println("parent");
		final int x=10;
		 
		
	}
}
class demo2 extends demo1
{
	
	/*
	 * public void display() {
	 * 
	 * } cant overide
	 */
}

public class FinalKeyword {

	public static void main(String[] args) {
		demo2 d=new demo2();
		d.display();

	}

}
