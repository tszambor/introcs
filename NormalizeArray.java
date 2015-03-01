// Exercise 2.1.18
// September 2014 edition

public class NormalizeArray {
    
    public static double max(double[] a)
    {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        return max;
    }
    
    public static double min(double[] a)
    {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
            if (a[i] < min) min = a[i];
        return min;
    }
    
    public static void rescale(double[] a)
    {
        double min = min(a);
        double max = max(a);
        double range = max - min;
        
        for (int i = 0; i < a.length; i++) {
            a[i] -= min;
            a[i] /= range;
        }
    }
    
    public static void main(String[] args)
    {
        double[] tab = { 1.2, 3.7, 19.8, 10.0, 12.7, 20.0, 1.0 };
        
        rescale(tab);
        
        for (int i = 0; i < tab.length; i++)
            StdOut.printf("%.5f ", tab[i]);
        StdOut.println();
    }
}