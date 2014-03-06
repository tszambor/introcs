// Exercise 1.5.17

public class DigitalAnalyzer
{
    public static void main(String[] args)
    {
        int count = 0;
        double avgMagnitude = 0.0;
        double avgPower = 0.0;
        int zeroCrossings = 0;
        double lastVal = 0.0;
        
        while (!StdIn.isEmpty())
        {
            double a = StdIn.readDouble();
            
            count++;
            
            avgMagnitude += Math.abs(a);
            
            avgPower += a*a;
            
            if (count > 1)
                if ((lastVal > 0 && a < 0) || (lastVal < 0 && a > 0))
                    zeroCrossings++;
            
            lastVal = a;
        }
        
        StdOut.println("Zero crossings " + zeroCrossings);
        StdOut.printf("Average magnitude %.3f", avgMagnitude / count);
        StdOut.println();
        StdOut.printf("Average power %.3f", avgPower / count);
        StdOut.println();
    }
}
        