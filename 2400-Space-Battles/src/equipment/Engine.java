package equipment;

public class Engine
{
    private String name;
    private int power;
    private int weight;
    
    public Engine(String name_, int power_, int weight_)
    {
        if(name_ == null) throw new IllegalArgumentException("Name cannot be null");
        if(name_.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be whitespace or empty");
        if(power_ < 0) throw new IllegalArgumentException("Power cannot be negative");
        if(weight_ < 0) throw new IllegalArgumentException("Weight cannot be negative");
        
        name = name_;
        power = power_;
        weight = weight_;
    }

    public String getName()
    {
        return name;
    }
    
    public int getPower()
    {
        return power;
    }
    
    public int getWeight()
    {
        return weight;
    }
}
