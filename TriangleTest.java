// Exercise 1.2.15

public class TriangleTest
{
    public static void main(String[] args)
    {
        if (args.length > 2)
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            
            System.out.println("The values could be a triangle: " + (a > b + c || b > a + c || c > a + b));
        }
        else
        {
            System.out.println("Please supply three positive integer arguments: the lengths of the triangle sides.");
        }
    }
}