// Exercise 2.1.18

public class RescaleArray
{
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
        
    public static void rescale(double[] arr)
    {
        double min = min(arr);
        double max = max(arr);
        double diff = max-min;
        
        for (int i = 0; i< arr.length; i++)
            arr[i] = (arr[i]-min) / diff;
        
    }
    
    public static void main(String[] args)
    {
        double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        
        rescale(array);
        
        for (int i = 0; i < array.length; i++)
            StdOut.printf("%.5f ", array[i]);
        StdOut.println();
    }
}