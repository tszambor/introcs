// Exercise 1.5.11

public class WordNo
{
    public static void main(String[] args)
    {
        int count = 0;
        
        while (!StdIn.isEmpty())
        {
            String word = StdIn.readString();
            count++;
        }
        
        StdOut.println(count);
    }
}