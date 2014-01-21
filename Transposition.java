// Exercise 1.4.12

public class Transposition
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        // create the square source array and put random values into it
        int[][] a = new int[N][N];
        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            a[i][j] = (int) (Math.random() * N);
        
        // print the source array
        System.out.println("Source array");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
        
        // print the transposition of the array
        System.out.println("Transposed array");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(a[j][i] + " ");
            
            System.out.println();
        }
    }
}
            