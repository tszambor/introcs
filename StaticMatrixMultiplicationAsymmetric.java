// Exercise 2.1.21
// September 2014 edition

public class StaticMatrixMultiplicationAsymmetric {
    
    public static double[][] multiply(double[][] a, double[][] b)
    {
        double[][] product = new double[a.length][a.length];
        
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b[i].length; j++)
            {
                double sum = 0.0;
                for (int k = 0; k < a[i].length; k++)
                {
                    sum += a[i][k] * b[k][j];
                }
                
                product[i][j] = sum;
            }
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
        double[][] a = { { 0.0, 1.0, 2.0, 3.0, 4.0 },
            { 5.0, 6.0, 7.0, 8.0, 9.0 } };
        
        double[][] b = { { 0.0, 1.0 },
            { 2.0, 3.0 },
            { 4.0, 5.0 },
            { 6.0, 7.0 },
            { 8.0, 9.0 } };
        
        printArray(a);
        StdOut.println();
        printArray(b);
        StdOut.println();
        
        double [][] c = multiply(a, b);
        
        printArray(c);
    }
}
        