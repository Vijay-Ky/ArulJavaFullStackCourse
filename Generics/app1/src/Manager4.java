class E <A, B, C, D>
{
	A i, j, k, l, m;
	B n, o, p, q, r;
	C s;
	D t;
	String x, y, z;
}
class Manager4 
{
	public static void main(String[] args) 
	{
		E <Integer, String, Boolean, Double> e1 = new E <Integer, String, Boolean, Double>();
		e1.i = 10;
		e1.j = 0;
		e1.k = 110;
		e1.l = 100;
		e1.m = 101;

		e1.r = "abc";
		e1.n = "a";
		e1.o = "ac";
		e1.p = "ab";
		e1.q = "c";

		e1.s = true;
		e1.t = 20.2;

		e1.x = "abcb";
		e1.y = e1.z = e1.x;

		System.out.println("done");
	}
}
