package app1;

@interface K
{
	//annotations can have return type as primitive array
	int[] versions();
}

@K(versions =  {1, 2, 3})
class M10
{
	@K(versions = {1, 2, 3})
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
