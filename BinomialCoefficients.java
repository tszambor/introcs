// Exercise 1.4.37

public class BinomialCoefficients
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        double[][] a = new double[N+1][];
        
        for (int i = 0; i <= N; i++)
        {
            a[i] = new double[i+2];
            a[i][0] = 0.0;
            a[i][i+1] = 0.0;
        }
        
        a[1][1] = 1.0;
        
        for (int i = 2; i <= N; i++)
        {
            for (int k = 1; k < a[i].length-1; k++)
            {
                a[i][k] = (a[i-1][k] + a[i-1][k-1]) / 2.0;
            }
        }
        
        // print the binomial distribution
        System.out.println("Binomial distribution");
        System.out.println();
        
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j < a[i].length-1; j++)
                System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
        
        System.out.println();
        
        // calculate binomial coefficients
        for (int i = 1; i <= N; i++)
            for (int j = 1; j < a[i].length-1; j++)
            a[i][j] *= Math.pow(2, i-1);
        
        System.out.println("Binomial coefficients");
        System.out.println();
        
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j < a[i].length-1; j++)
                System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
        
            
    }
}