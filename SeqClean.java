// Exercise 1.5.6

public class SeqClean
{
    public static void main(String[] args)
    {
        int previous = 0, value = 0;
        
        if (!StdIn.isEmpty())
            previous = StdIn.readInt();
        
        StdOut.print(previous + " ");
        
        while (!StdIn.isEmpty())
        {
            value = StdIn.readInt();
            
            if (value != previous)
            {
                StdOut.print(value + " ");
                previous = value;
            }
        }
        
        StdOut.println();
    }
}