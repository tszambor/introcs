// Exercise 1.4.3

public class EuclideanDistance
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        double[] a = new double[N];
        double[] b = new double[N];
        
        for (int i = 0; i < N; i++)
        {
            a[i] = Math.random();
            b[i] = Math.random();
        }
        
        double sum = 0.0;
        
        for (int i = 0; i < N; i++)
            sum += Math.pow(a[i] - b[i], 2);
        
        double distance = Math.sqrt(sum);
        
        System.out.println(distance);
    }
}