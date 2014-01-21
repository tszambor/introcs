public class ArraysFun
{
    public static void main(String[] args)
    {
        int N = 15;
        
        double[] a = new double[N];
        
        // initialize with random values
        for (int i = 0; i < N; i++)
            a[i] = Math.random();
        
        // print one per line
        for (int i = 0; i < N; i++)
            System.out.println(a[i]);
        
        // find the maximum
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < N; i++)
            if (a[i] > max) max = a[i];
        
        // compute the average
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum += a[i];
        
        double average = sum / N;
        
        // copy to another array
        double[] b = new double[N];
        
        for (int i = 0; i < N; i++)
            b[i] = a[i];
        
        // reverse the elements within an array
        for (int i = 0; i < N/2; i++)
        {
            double temp = b[i];
            b[i] = b[N-1-i];
            b[N-i-1] = temp;
        }
    }
}