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
        if(power < 0)
        {
            throw new IllegalArgumentException("The Power must be greater than 0");
        }
        else
        {
            this.power = power;
        }
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
