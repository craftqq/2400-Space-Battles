package equipment;

public class Weapon
{   
    private int damage;
    private int type;
    public static final int TYPE_LASER = 0;
    public static final int TYPE_PARTICLE = 1;
    public static final int TYPE_CONVENTIONAL = 2;
    public static final int TYPE_ROCKET = 3;
    public static final int TYPE_TORPEDO = 4;
    
    public Weapon(int damage_, int type_)
    {
        damage = damage_;
        if(type<0||type>4)
        {
            throw new IllegalArgumentException("the Type has to be set to one of the avaible weapon types");
        }
        type = type_;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getType()
    {
        return type;
    }
    
}
