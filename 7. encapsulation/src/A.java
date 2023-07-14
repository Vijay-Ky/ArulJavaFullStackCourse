class A 
{
	private String name;
	private String idNum;
	private int age;

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getIdnum()
	{
		return idNum;
	}

	public void setAge(int newAge)
	{
		this.age = newAge;
	}

	public void setName(String newName)
	{
		this.name =  newName;
	}

	public void setIdnum(String newId)
	{
		this.idNum = newId;
	}
}
class MyDriver 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.setName("vijay");
		a1.setAge(990);
		a1.setIdnum("A1420");
		System.out.println("Name: " + a1.getName() + " Age: " + a1.getAge() +
			" Idnum: " + a1.getIdnum());
	}
}
/*
1. Encapsulation in Java is a process of wrapping code and data together 
into a single unit, for example, a capsule which is mixed of several medicines.
2. We can create a fully encapsulated class in Java by making all the data 
   members of the class private.
3. By providing only a setter or getter method, you can make the class read-only
   or write-only. In other words, you can skip the getter or setter methods.
4. It provides you the control over the data. Suppose you want to set the value 
   of id which should be greater than 100 only, you can write the logic inside the setter method.
   You can write the logic not to store the negative numbers in the setter methods.
5. It is a way to achieve data hiding in Java because other class will not be able 
   to access the data through the private data members.
*/