public class DotProduct
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        
        int N = 3;
        
        double x[] = new double[N];
        double y[] = new double[N];
        
        // check that one of the elements is 0
        
        System.out.println(x[1] + ", " + y[1]);
        
        x[0] = 0.30; x[1] = 0.60; x[2] = 0.10;
        y[0] = 0.50; y[1] = 0.10; y[2] = 0.40;
        
        for (int i = 0; i < N; i++)
            sum += x[i] * y[i];
        
        System.out.println(sum);
        
    }
}