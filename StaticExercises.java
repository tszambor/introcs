// Exercise 2.1.1

public class StaticExercises
{
    public static int max3(int arg1, int arg2, int arg3)
    {
        return Math.max(arg1, Math.max(arg2, arg3));
    }
    
    public static double max3(double arg1, double arg2, double arg3)
    {
        return Math.max(arg1, Math.max(arg2, arg3));
    }
    
    public static boolean odd(boolean arg1, boolean arg2, boolean arg3)
    {
        int trueArgs = 0;
        
        if (arg1) trueArgs++;
        if (arg2) trueArgs++;
        if (arg3) trueArgs++;
        
        return trueArgs % 2 != 0;
    }
    
    public static boolean majority(boolean arg1, boolean arg2, boolean arg3)
    {
        return (arg1 && arg2) || (arg1 && arg3) || (arg2 && arg3);
    }
    
    public static boolean eq(int[] arg1, int[] arg2)
    {
        if (arg1.length == arg2.length)
        {
            for (int i = 0; i < arg1.length; i++)
            {
                if (arg1[i] != arg2[i])
                    return false;
            }
            
            return true;
        } else
            return false;
    }
        
    public static boolean areTriangular(double arg1, double arg2, double arg3)
    {
        return (arg1 < arg2 + arg3) && (arg2 < arg1 + arg3) && (arg3 < arg1 + arg2);
    }
    
    public static double sigmoid(double x)
    {
        return 1.0 / (1.0 - Math.exp(-x));
    }
    
    public static double lg(double N)
    {
        // Exercise 2.1.10
        return Math.log(N) / Math.log(2.0);
    }
    
    public static int lg(int N)
    {
        // Exercise 2.1.11
        int log2 = 0;
        
        while (N >= 2) // shouldn't it be one actually? This is how I did it after a few months
        {
            N /= 2;
            log2++;
        }
        
        return log2;
    }
    
    public static int signum(int N)
    {
        // Exercise 2.1.12
        if (N < 0)
            return -1;
        else if (N > 0)
            return 1;
        else
            return 0;
    }
    
    public static void main(String[] args)
    {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);
        double arg4 = Double.parseDouble(args[3]);
        double arg5 = Double.parseDouble(args[4]);
        double arg6 = Double.parseDouble(args[5]);
        double arg7 = Double.parseDouble(args[6]); // value for the lg(double) function.
        int arg8 = Integer.parseInt(args[7]); // value for the lg(int) function.
        
        StdOut.println(max3(arg1, arg2, arg3));
        StdOut.println(max3(arg4, arg5, arg6));
        
        int[] tab1 = { 0, 1, 2, 3, 4, 5};
        int[] tab2 = { 0, 2, 2, 3, 4, 5};
        int[] tab3 = { 0, 1, 2, 3, 4 };
        int[] tab4 = { 0, 1, 2, 3, 4, 5 };
        
        StdOut.println("odd()");
        StdOut.println(odd(true, true, true));
        StdOut.println(odd(true, false, true));
        
        StdOut.println("majority()");
        StdOut.println(majority(true, false, false));
        StdOut.println(majority(true, false, true));
        StdOut.println(majority(true, true, true));
        
        StdOut.println("eq()");
        StdOut.println(eq(tab1, tab2));
        StdOut.println(eq(tab1, tab3));
        StdOut.println(eq(tab1, tab4));
        
        StdOut.println("areTriangular()");
        StdOut.println(areTriangular(7.0, 10.0, 5.0));
        
        StdOut.println(lg(arg7));
        StdOut.println(lg(arg8));
        
        StdOut.println(signum(-100));
        StdOut.println(signum(2014));
        StdOut.println(signum(0));
        
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-10.0, 10.0);
        
        double step = 2.0 / 1000.0;
        
        for (int i = 0; i < 1000; i++)
        {
            double x = -1.0 + i * step;
            
            StdDraw.point(x, sigmoid(x));
        }
    }
}