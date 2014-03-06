// Exercise 1.5.7

public class MissingValue
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        boolean[] a = new boolean[N];
        
        for (int i = 0; i < N-1; i++)
            if (!StdIn.isEmpty())
            a[StdIn.readInt()-1] = true;
        else
            break;
        
        for (int i = 0; i < N; i++)
            if (!a[i])
        {
            StdOut.println(i+1);
            break;
        }
        
    }
}