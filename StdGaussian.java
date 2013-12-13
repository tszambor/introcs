// Exercise 1.2.27

public class StdGaussian
{
    public static void main(String[] args)
    {
        double w = Math.sin(2 * Math.PI * Math.random()) * Math.sqrt(-2 * Math.log(Math.random()));
        
        System.out.println(w);
    }
}