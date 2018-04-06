package equipment;

import static util.Precondition.*;

public class Engine
{
    private String name;
    private int power;
    private int warpPower;
    private int weight;
    
    public Engine(String name_, int power_, int warpPower_, int weight_)
    {
        guardNotNull(name_,"Engine Name");
        guardNotWhitespaceOrEmpty(name_, "Engine Name");
        guardNotNegative(power_, "Engine Power");
        guardNotNegative(warpPower_, "Engine Warp Power");
        guardNotNegative(weight_, "Engine Weight");
        
        name = name_;
        power = power_;
        weight = weight_;
        warpPower = warpPower_;
    }

    public String getName()
    {
        return name;
    }
    
    public int getPower()
    {
        return power;
    }
    
    public int getWarpPower()
    {
        return warpPower;
    }
    
    public int getWeight()
    {
        return weight;
    }
}
