// Exercise 1.5.9

// so actually this program prints the dragon curve of level 3. The difference here is it operates on the string and reverse string
// supplied from the command line.

public class Dragon
{
    public static void main(String[] args)
    {
        String dragon = StdIn.readString();
        String nogard = StdIn.readString();
        StdOut.print(dragon + "L" + nogard);
        StdOut.print(" ");
        StdOut.print(dragon + "R" + nogard);
        StdOut.print(" ");
    }
}