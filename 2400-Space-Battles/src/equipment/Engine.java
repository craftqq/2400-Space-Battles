package equipment;

import static util.Preconditions.*;

public class Engine
{
    private String name;
    private int power;
    private int warpPower;
    private int weight;
    
    public Engine(String name_, int power_, int warpPower_, int weight_)
    {
        guardNonNull(name_,"Engine Name");
        if(name_.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be whitespace or empty!");
        guardNonNegative(power_, "Engine Power");
        guardNonNegative(warpPower_, "Engine Warp Power");
        guardNonNegative(weight_, "Engine Weight");
        
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
