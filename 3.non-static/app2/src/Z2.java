class Z2
{
	Z2()
	{
		super();
		//this(10);
		System.out.println("Z2()");
	}
	Z2(int i)
	{
	}
	public static void main(String[]args)
	{
		Z2 b1 = new Z2();
		System.out.println("-----");
		Z2 b2 = new Z2();
		System.out.println("-----");
	}
}