// Exercise 1.4.30

public class Minesweeper
{
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        
        boolean[][] field = new boolean[M+2][N+2];
        
        // initialize the array
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++)
            if (Math.random() < p)
                field[i][j] = true;
            
        // print the initial array
        for (int i = 1; i <= M; i++)
        {
            for (int j = 1; j <= N; j++)
                if (field[i][j])
                System.out.print("* ");
            else
                System.out.print(". ");
            
            System.out.println();
        }
        
        int[][] neighborhood = new int[M][N];
        
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++)
        {
            int sum = 0;
            
            for (int y = i-1; y <= i+1; y++)
                for (int x = j-1; x <= j+1; x++)
                if ((i != y || j != x) && field[y][x])
                sum++;
            
            neighborhood[i-1][j-1] = sum;
        }
        
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(neighborhood[i][j] + " ");
            
            System.out.println();
        }     
    }
}