// Exercise 1.5.10

public class TenPerLine
{
    public static void main(String[] args)
    {
        int count = 0;
        
        while (!StdIn.isEmpty())
        {
            int a = StdIn.readInt();
            
            count++;
            
            StdOut.printf("%2d ", a);
            
            if (count % 10 == 0)
                StdOut.println();
        }
        
        StdOut.println();
    }
}