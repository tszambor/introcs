// Exercise 1.5.8

public class Means
{
    public static void main(String[] args)
    {
        int count = 0;
        
        double sumHarmonic = 0.0;
        double sumLogGeo = 0.0;
        
        while (!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            
            sumHarmonic += 1.0 / x;
            sumLogGeo += Math.log(x);
            count++;
        }
        
        StdOut.println("Harmonic mean " + count * 1.0 / sumHarmonic);
        StdOut.println("Geometric mean " + Math.exp(sumLogGeo / (count * 1.0)));
    }
}