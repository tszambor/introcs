// Exercise 2.1.22
// September 2014 edition

public class StaticBooleanArrayScan {
    
    public static boolean any(boolean[] a)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i]) return true;
        
        return false;
    }
    
    public static boolean all(boolean[] a)
    {
        for (int i = 0; i < a.length; i++)
            if (!a[i]) return false;
        
        return true;
    }
    
    public static void main(String[] args)
    {
        boolean[] a = { false, true, true, true, true, false };
        boolean[] b = { true, true, true, true, true, true };
        boolean[] c = { false, false, false, false, false };
        
        StdOut.println("any(a) " + any(a)); // true
        StdOut.println("all(a) " + all(a)); // false
        
        StdOut.println("any(b) " + any(b)); // true
        StdOut.println("all(b) " + all(b)); // true
        
        StdOut.println("any(c) " + any(c)); // false
        StdOut.println("all(c) " + all(c)); // false
    }
}