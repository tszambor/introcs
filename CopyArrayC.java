// Exercise 1.4.11

public class CopyArrayC
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int[][] a = new int[N][];
        
        // initialize the source array
        for (int i = 0; i < N; i++)
            a[i] = new int[(int) (Math.random() * N)];
        
        // now for some values
        for (int i = 0; i < N; i++)
            for (int j = 0; j < a[i].length; j++)
            a[i][j] = (int) (Math.random()*N);
        
        int n = a.length;
        
        int[][] b = new int[n][];
        
        for (int i = 0; i < n; i++)
            b[i] = new int [a[i].length];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < a[i].length; j++)
            b[i][j] = a[i][j];
 
        
        // print the source array
        System.out.println("Source array");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
        
        // print the destination array
        System.out.println("Destination array");
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
}