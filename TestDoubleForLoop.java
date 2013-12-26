public class TestDoubleForLoop
{
    public static void main(String[] args)
    {
        for (double x = 0.0; x <= 1.0; x+= 0.1)
            System.out.println(x + " " + Math.sin(x));
    }
}