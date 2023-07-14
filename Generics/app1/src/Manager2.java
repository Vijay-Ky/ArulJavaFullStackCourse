class C <X>
{
	X i;
}
class Manager2 
{
	public static void main(String[] args) 
	{
		C <String> c1 = new C <String>();
		c1.i = "abc";
		C <Integer> c2 = new C <Integer>();
		c2.i = 200;
		C <Double> c3 = new C <Double>();
		c3.i = 20.0;
		C <Boolean> c4 = new C <Boolean>();
		c3.i = true;
		System.out.println("Hello World!");
	}
}
