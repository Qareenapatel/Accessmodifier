package accessmodifiers;

class A
{
	/*private int i=10;
	private void m1()
	{
		System.out.println(i);
	}*/
	
	int i=10;
	 
	void m1()
{
		System.out.println(i);
}
}

public class AccessmodifiersExample {

	public static void main(String[] args) {

		A aobj=new A();
		
		//aobj.i=10; // cannot access since it is private
		//aobj.m1(); // cannot access since it is private

		aobj.i=10;// default modifier
		aobj.m1();
	}

}
