class Car
{
	private String color;
	private int maxSpeed;

	public void carInfo()
	{
		System.out.println("carInfo: " + "color: " + this.color + " " + "maxSpeed: " + this.maxSpeed);
	}

	public void setColor(String color)
	{
		this.color = color;

	}

	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
}
//IS-A(Uni-directional(single direction))(inheritance)
class BMW extends Car
{
	public void BMWStart()
	{
		//HAS-A (composition)
		Engine bmwEngine = new Engine();
		bmwEngine.start();
		bmwEngine.stop();

	}
}
class Engine
{
	public void start()
	{
		System.out.println("Start Engine: ");
	}
	public void stop()
	{
		System.out.println("Stop Engine: ");
	}
}

//IS-A
class Benz extends Car
{
	public void benzStart()
	{
		//HAS-A (composition)
		Engine benzEngine = new Engine();
		benzEngine.start();
		benzEngine.stop();

	}
}

class Relationship
{
	public static void main(String[] arg)
	{
		BMW myBMW = new BMW();
		myBMW.setColor("RED");
		myBMW.setMaxSpeed(300);
		myBMW.carInfo();
		myBMW.BMWStart();

		Benz myBenz = new Benz();
		myBenz.setColor("BLACK");
		myBenz.setMaxSpeed(400);
		myBenz.carInfo();
		myBenz.benzStart();
	}
}