package equipment;

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
    
    public Weapon(String name_, int damage_, WEAPON_TYPE type_)
    {
        if(name_ == null) throw new IllegalArgumentException("Name cannot be null");
        if(name_.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be whitespace or empty");
        if(damage_ < 0) throw new IllegalArgumentException("Damage cannot be negative");
        if(type_ == null) throw new IllegalArgumentException("Weapon Type cannot be null");
        
        name = name_;
        damage = damage_;
        type = type_;
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
    
    
}
