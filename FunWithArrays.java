public class FunWithArrays
{
    public static double max(double[] a)
    {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        return max;
    }
    
    public static double dot(double[] a, double[] b)
    {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i] * b[i];
        return sum;
    }
    
    public static void exch(String[] a, int i, int j)
    {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public static void print(double[] a)
    {
        StdOut.println(a.length);
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
    
    public static double[][] readDouble2D()
    {
        int M = StdIn.readInt();
        int N = StdIn.readInt();
        double[][] a = new double[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
            a[i][j] = StdIn.readDouble();
        return a;
    }
    
    public static void main(String[] args)
    {
    }
}