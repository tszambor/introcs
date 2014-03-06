// Exercise 1.5.12

public class Tabelarize
{
    public static void main(String[] args)
    {
        while (!StdIn.isEmpty())
        {
            String name = StdIn.readString();
            int val1 = StdIn.readInt();
            int val2 = StdIn.readInt();
            
            StdOut.printf("%s %d %d %.3f", name, val1, val2, 1.0 * val1 / val2);
            StdOut.println();
        }
    }
}