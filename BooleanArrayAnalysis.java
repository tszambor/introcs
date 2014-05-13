// Exercise 2.1.22

public class BooleanArrayAnalysis
{
    public static boolean any(boolean[] a)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == true)
            return true;
        
        return false;
    }
    
    public static boolean all(boolean[] a)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == false)
            return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        boolean[] a = { false, false, false, true, false, true };
        boolean[] b = { false, false, false, false, false, false };
        boolean[] c = { true, true};
        
        StdOut.println(any(a));
        StdOut.println(all(a));
        
        StdOut.println(any(b));
        StdOut.println(all(b));
        
        StdOut.println(any(c));
        StdOut.println(all(c));
    }
}