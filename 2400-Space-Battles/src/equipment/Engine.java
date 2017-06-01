package equipment;
/**
 * Created by Michael on 01.06.2017.
 */
public class Engine
{
	private int power;
	private String name;
	public Engine(String name, int power)
	{
		this.name = name;
		this.power = power;
	}

	public int getPower()
	{
		return power;
	}

	public String getName()
	{
		return name;
	}
}
