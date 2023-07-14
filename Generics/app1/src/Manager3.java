class D <Z>
{
	String s1;
	Z s2;
	Z s3;
	Z s4;
}
class Manager3
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.s1 = "abc";
		d1.s2 = 100;
		System.out.println(d1.s1);
		System.out.println(d1.s2);
		D <String> d2 = new D<String>();
		d2.s1 = "abc";
		//d2.s2 = 100;
		D <Boolean> d3 = new D<Boolean>();
		d3.s1 = "abc";
		d3.s2 = true;
		d3.s2 = false;
		d3.s2 = true;
	}
}
