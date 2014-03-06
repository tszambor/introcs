// Exercise 1.5.3

public class MeanDeviation
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        double[] a = new double[N];
        
        double sum = 0.0;
        
        for (int i = 0; i < N; i++)
        {
            if (!StdIn.isEmpty())
            {
                double in = StdIn.readDouble();
                
                sum += in;
                a[i] = in;
            }
            else
                break;
        }
        
        double average = sum / N;
        
        double sumSquares = 0.0;
        
        for (int i = 0; i < N; i++)
        {
            double diff = a[i] - average;
            sumSquares += diff * diff;
        }
        
        double deviation = Math.sqrt(sumSquares / (N-1));
        
        StdOut.println("Average " + average);
        StdOut.println("Standard Deviation " + deviation);
    }
}