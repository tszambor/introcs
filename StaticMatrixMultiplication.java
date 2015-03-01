// Exercise 2.1.21
// September 2014 edition

public class StaticMatrixMultiplication {
    
    public static double[][] multiply(double[][] a, double[][] b)
    {
        int size = a.length;
        
        double[][] product = new double[size][size];
        
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
        {
            double sumProduct = 0.0;
            for (int k = 0; k < size; k++)
                sumProduct += a[i][k] * b[k][j];
            product[i][j] = sumProduct;
        }
        
        return product;
    }
    
    public static void printArray(double[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
                StdOut.printf("%.2f ", a[i][j]);
            StdOut.println();
        }
    }
    
    public static void main(String[] args)
    {
        double[][] a = { { .70, .20, .10 },
            { .30, .60, .10 },
            { .50, .10, .40 } };
        
        double[][] b = { { .80, .30, .50 },
            { .10, .40, .10 },
            { .10, .30, .40 } };
        
        printArray(a);
        StdOut.println();
        printArray(b);
        StdOut.println();
        
        double [][] c = multiply(a, b);
        
        printArray(c);
    }
}
        