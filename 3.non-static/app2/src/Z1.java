class Z1
{
	Z1()
	{	
		//this(20);
		Z1 z1 = new Z1(9);
	}
	
	Z1(int i)
	{
		//this();
		Z1 z2 = new Z1();
	}
	public static void main(String[] args)
	{
		System.out.println("-----");
		Z1 z1 = new Z1();
		System.out.println("-----");
	}
}