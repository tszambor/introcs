// Exercise 1.6.14

public class RandomWeb
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        StdOut.println(N);
        
        for (int i = 0; i < M; i++)
        {
            int source = (int) (Math.random() * N);
            int destination = (int) (Math.random() * N);
            
            StdOut.printf("%d %d\t", source, destination);
        }
        
        StdOut.println();
    }
}