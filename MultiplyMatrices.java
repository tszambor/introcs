// Exercise 2.1.21

public class MultiplyMatrices
{
    public static double[][] multiply(double[][] a, double[][] b)
    {
        int N = a.length;
        int M = b[0].length;
        int K = b.length;
        
        
        double[][] c = new double[N][M];
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                // Compute dot product of row i and column j.
                for (int k = 0; k < K; k++)
                    c[i][j] += a[i][k]*b[k][j];
            }
        }
        
        return c;
    }
    
    public static void displayMatrix(double[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
                StdOut.printf("%.2f ", a[i][j]);
            StdOut.println();
        }
    }
    
    public static void main(String[] args)
    {
        double[][] a =  { 
            { .70, .20, .10 },
            { .30, .60, .10 },
            { .50, .10, .40 }
        };
        
        double[][] b = {
            { .80, .30, .50 },
            { .10, .40, .10 },
            { .10, .30, .40 }
        };
        
        double[][] c = multiply(a, b);
        
        displayMatrix(c);
        
        double[][] d = {
            { .10, .20 },
            { .30, .40 },
            { .50, .60 },
            { .70, .80 }
        };
        
        double[][] e = {
            { .10, .20, .30, .40, .50, .60, .70, .80, .90 },
            { .15, .25, .35, .45, .55, .65, .75, .85, .95 }
        };
        
        double[][] f = multiply(d, e);
        
        displayMatrix(f);
        
    }
}