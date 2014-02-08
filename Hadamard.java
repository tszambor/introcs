// Exercise 1.4.26

public class Hadamard
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        boolean[][] hadamard = new boolean[N+1][N+1];
        
        for (int i = 1; i <= N; i *= 2)
        {
            // Build H(i)
            if (i > 1)
            {
                for (int j = 1; j <= i/2; j++)
                {
                    for (int k = 1; k <= i/2; k++)
                    {
                        hadamard[j+i/2][k] = hadamard[j][k];
                        hadamard[j][k+i/2] = hadamard[j][k];
                        hadamard[j+i/2][k+i/2] = hadamard[j][k];
                    }
                        
                }
                
                // now reverse proper region of the new array
                for (int j = i; j > i/2; j--)
                    for (int k = i; k > i/2; k--)
                    hadamard[j][k] = !hadamard[j][k];
            }
            else
                hadamard[i][i] = true;
        }
        
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N; j++)
                if (hadamard[i][j])
                    System.out.print("T ");
                else
                    System.out.print("F ");
                
            System.out.println();
        }
    }
}