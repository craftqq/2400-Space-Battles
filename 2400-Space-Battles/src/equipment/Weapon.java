package equipment;

import static util.Preconditions.*;

public class Weapon
{
    public static final int TYPE_LASER = 0;
    public static final int TYPE_PARTICLE = 1;
    public static final int TYPE_CONVENTIONAL = 2;
    public static final int TYPE_ROCKET = 3;
    public static final int TYPE_TORPEDO = 4;
    
    public enum WEAPON_TYPE
    {
        LASER,PARTICLE,BALLISTIC,ROCKET,TORPEDO
    }

    private String name;
    private int damage;
    private WEAPON_TYPE type;
    private int weight;
    
    public Weapon(String name_, int damage_, WEAPON_TYPE type_, int weight_)
    {
        guardNonNull(name_,"Weapon Name");
        if(name_.trim().isEmpty()) throw new IllegalArgumentException("Weapon Name cannot be whitespace or empty!");
        guardNonNegative(damage_, "Weapon Damage");
        guardNonNull(type,"Weapon Type");
        guardNonNegative(weight_, "Weapon Weight");
        
        name = name_;
        damage = damage_;
        type = type_;
        weight = weight_;
    }

    public String getName() 
    {
        return name;
    }
    public int getDamage()
    {
        return damage;
    }
    
    public WEAPON_TYPE getType()
    {
        return type;
    }
    
    public int getWeight()
    {
        return weight;
    }
}
