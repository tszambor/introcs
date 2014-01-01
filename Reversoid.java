// Exercise 1.3.12

public class Reversoid
{
    public static void main(String[] args)
    {
        // The result expected by me after the initial code analysis
        // is for the program to reverse its input contained in
        // variable n into variable m.
        
        int n = 123456789;
        int m = 0;
        
        System.out.println("n = " + n + ", m = " + m);
        
        while (n != 0)
        {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        
        System.out.println("n = " + n + ", m = " + m);
    }
}