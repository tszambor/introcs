// Program 2.1.1
// Exercise 2.1.8

public class NewtonModularStatic
{
    public static double abs(double arg, String indent)
    {
        indent += '\t';
        
        StdOut.println(indent + "abs(" + arg + ")");
        
        if (arg < 0.0)
            arg *= -1.0;
        
        StdOut.println(indent + "return " + arg);
        
        return arg;
    }
    
    public static double sqrt(double c, String indent)
    {
        // Compute the square root of c.
        indent += '\t';
        
        StdOut.println(indent + "sqrt(" + c + ")");
        
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (abs(t - c/t, indent) > err * t)
            t = (c/t + t) / 2.0;
        
        StdOut.println(indent + "return " + t);
        
        return t;
    }
    
    public static void main(String[] args)
    {
        // Print square roots of arguments.
        int N = args.length;
        double[] a = new double[N];
        String indent = "";
        
        StdOut.print("main({");
        for (int i = 0; i < N; i++)
        {
            a[i] = Double.parseDouble(args[i]);
            StdOut.print(a[i] + ", ");
        }
        StdOut.println("})");
        
        for (int i = 0; i < N; i++)
        {
            // Print square root of ith argument.
            double x = sqrt(a[i], indent);
            StdOut.println(x);
        }
        
        StdOut.println("return");
    }
}