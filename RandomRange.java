// Exercise 1.2.19

public class RandomRange
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println(a + Math.round((b - a) * Math.random()));
    }
}