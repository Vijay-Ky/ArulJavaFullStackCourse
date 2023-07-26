package app4;

interface R
{
	void test1();
}
enum S implements R
{
	;
	@Override
	public void test1()
	{

	}
}
//we cant develop abstract enum bcz it cant have extends