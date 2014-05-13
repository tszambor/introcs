public class Statics
{
    public static int abs(int x)
    {
        if (x < 0) return -x;
        else return x;
    }
    
    public static double abs(double x)
    {
        if (x < 0.0) return -x;
        else return x;
    }
    
    public static boolean isPrime(int N)
    {
        if (N < 2) return false;
        for (int i = 2; i <= N/i; i++)
            if (N % i == 0) return false;
        return true;
    }
    
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt(a*a + b*b);
    }
    
    public static double H(int N)
    {
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        return sum;
    }
    
    public static int uniform(int N)
    {
        return (int) (Math.random() * N);
    }
    
    public static void drawTriangle(double x0, double y0, double x1, double y1, double x2, double y2)
    {
        StdDraw.line(x0, y0, x1, y1);
        StdDraw.line(x1, y1, x2, y2);
        StdDraw.line(x2, y2, x0, y0);
    }
    
    public static void main(String[] args)
    {
        double x = hypotenuse(5.0, 7.0);
    }
}