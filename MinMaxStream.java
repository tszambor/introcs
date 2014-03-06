// Exercise 1.5.1

public class MinMaxStream
{
    public static void main(String[] args)
    {
        int min = 0, max = 0;
        
        if (!StdIn.isEmpty())
        {
            min = StdIn.readInt();
            max = min;
        }
        
        while (!StdIn.isEmpty())
        {
            int a = StdIn.readInt();
            
            if (min > a)
                min = a;
            
            if (max < a)
                max = a;
        }
        
        StdOut.println("Min " + min);
        StdOut.println("Max " + max);
    }
}