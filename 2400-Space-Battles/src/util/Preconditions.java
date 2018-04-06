package util;

public class Preconditions
{
    
    private Preconditions(){}
    
    
    public static void guardNonNull(Object o, String name)
    {
        if(o == null) throw new IllegalArgumentException(name + " cannot be null!");
    }
    
    public static void guardNonNegative(int i, String name)
    {
        if(i < 0) throw new IllegalArgumentException(name + " cannot be negative!");
    }
}
