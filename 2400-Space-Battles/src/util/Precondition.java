package util;

public class Precondition
{
    
    private Precondition(){}
    
    
    public static void guardNotNull(Object o, String name)
    {
        if(o == null) throw new IllegalArgumentException(name + " cannot be null!");
    }
    
    public static void guardNotWhitespaceOrEmpty(String s, String name)
    {
        if(s.trim().isEmpty()) throw new IllegalArgumentException(name + " cannot be only whitespace or empty!");
    }
    
    public static void guardNotNegative(int i, String name)
    {
        if(i < 0) throw new IllegalArgumentException(name + " cannot be negative!");
    }
}
