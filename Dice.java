// Exercise 1.2.20

public class Dice
{
    public static void main(String[] args)
    {
        int a = (int) (6 * Math.random()) + 1;
        int b = (int) (6 * Math.random()) + 1;
        
        System.out.println(a + b);
    }
}