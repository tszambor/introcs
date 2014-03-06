// Exercise 1.5.10

public class RandomIntSeq
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        for (int i = 0; i < N; i++)
        {
            int a = (int) (Math.random() * M);
            StdOut.print(a + " ");
        }
    }
}