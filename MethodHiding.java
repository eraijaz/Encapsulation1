class telusko1
{
	public static void disp() {
		System.out.println("parent telusko");
		
		
	}
	
}
class alian1 extends telusko1
{
	public static void disp() //staic methods cant be overridden,
							//here it becomes specialized not overridden
	{
		System.out.println("alian is telusko");
		
	}
}
public class MethodHiding {

	public static void main(String[] args)
	{
		/*
		 * alian1 a =new alian1(); a.disp();
		 */
		
		telusko1 t= new alian1();
		t.disp();// method hiding is happening 
		
		
	}

}
