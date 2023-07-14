class K
{
     static int i;
	 public static void main(String[] args)
     {
        System.out.println("a: " + i);
        int i = 10;
        System.out.println("b: " + K.i);
        i = 20;
        System.out.println("c: " + K.i);
        System.out.println("d: " + K.i);
     }
}
